package com.rsl.domain.credit.repository;

import com.rsl.domain.credit.model.aggregate.TradeAggregate;
import com.rsl.domain.credit.model.entity.CreditAccountEntity;

/**
 * @ description:用户积分仓储
 * @ author: rsl
 * @ create: 2024-09-03 10:04
 **/
public interface ICreditRepository {
    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

    CreditAccountEntity queryUserCreditAccount(String userId);
}
