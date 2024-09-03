package com.rsl.domain.credit.service;

import com.rsl.domain.credit.model.aggregate.TradeAggregate;
import com.rsl.domain.credit.model.entity.CreditAccountEntity;
import com.rsl.domain.credit.model.entity.CreditOrderEntity;
import com.rsl.domain.credit.model.entity.TradeEntity;
import com.rsl.domain.credit.repository.ICreditRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ description:积分调额服务【正逆向，增减积分】
 * @ author: rsl
 * @ create: 2024-09-03 10:06
 **/
@Service
@Slf4j
public class CreditAdjustService implements ICreditAdjustService{
    @Resource
    private ICreditRepository creditRepository;

    @Override
    public String createOrder(TradeEntity tradeEntity) {
        log.info("增加账户积分额度开始 userId:{} tradeName:{} amount:{}", tradeEntity.getUserId(), tradeEntity.getTradeName(), tradeEntity.getAmount());
        // 1. 创建账户积分实体
        CreditAccountEntity creditAccountEntity = TradeAggregate.createCreditAccountEntity(
                tradeEntity.getUserId(),
                tradeEntity.getAmount());

        // 2. 创建账户订单实体
        CreditOrderEntity creditOrderEntity = TradeAggregate.createCreditOrderEntity(
                tradeEntity.getUserId(),
                tradeEntity.getTradeName(),
                tradeEntity.getTradeType(),
                tradeEntity.getAmount(),
                tradeEntity.getOutBusinessNo());

        // 3. 构建交易聚合对象
        TradeAggregate tradeAggregate = TradeAggregate.builder()
                .userId(tradeEntity.getUserId())
                .creditAccountEntity(creditAccountEntity)
                .creditOrderEntity(creditOrderEntity)
                .build();

        // 4. 保存积分交易订单
        creditRepository.saveUserCreditTradeOrder(tradeAggregate);
        log.info("增加账户积分额度完成 userId:{} orderId:{}", tradeEntity.getUserId(), creditOrderEntity.getOrderId());

        return creditOrderEntity.getOrderId();
    }

}
