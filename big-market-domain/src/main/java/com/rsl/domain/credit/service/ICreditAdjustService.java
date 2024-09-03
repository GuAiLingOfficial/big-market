package com.rsl.domain.credit.service;

import com.rsl.domain.credit.model.entity.TradeEntity;

/**
 * @ description:积分调额接口【正逆向，增减积分】
 * @ author: rsl
 * @ create: 2024-09-03 10:06
 **/
public interface ICreditAdjustService {

    /**
     * 创建增加积分额度订单
     * @param tradeEntity 交易实体对象
     * @return 单号
     */
    String createOrder(TradeEntity tradeEntity);

}

