package com.rsl.domain.activity.service.quota.policy.impl;

import com.rsl.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import com.rsl.domain.activity.model.valobj.OrderStateVO;
import com.rsl.domain.activity.repository.IActivityRepository;
import com.rsl.domain.activity.service.quota.policy.ITradePolicy;
import org.springframework.stereotype.Service;

/**
 * @ description:积分兑换，支付类订单
 * @ author: rsl
 * @ create: 2024-09-04 11:56
 **/
@Service("credit_pay_trade")
public class CreditPayTradePolicy implements ITradePolicy {

    private final IActivityRepository activityRepository;

    public CreditPayTradePolicy(IActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    @Override
    public void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate) {
        createQuotaOrderAggregate.setOrderState(OrderStateVO.wait_pay);
        activityRepository.doSaveCreditPayOrder(createQuotaOrderAggregate);
    }

}
