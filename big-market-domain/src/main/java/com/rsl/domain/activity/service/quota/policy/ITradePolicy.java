package com.rsl.domain.activity.service.quota.policy;

import com.rsl.domain.activity.model.aggregate.CreateQuotaOrderAggregate;

/**
 * @ description:交易策略接口，包括；返利兑换（不用支付），积分订单（需要支付）
 * @ author: rsl
 * @ create: 2024-09-04 11:55
 **/
public interface ITradePolicy {

    void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate);

}

