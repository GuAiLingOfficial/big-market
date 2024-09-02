package com.rsl.domain.award.repository;

import com.rsl.domain.award.model.aggregate.GiveOutPrizesAggregate;
import com.rsl.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @ description:奖品仓储服务
 * @ author: rsl
 * @ create: 2024-08-15 15:42
 **/
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

    String queryAwardConfig(Integer awardId);

    void saveGiveOutPrizesAggregate(GiveOutPrizesAggregate giveOutPrizesAggregate);

    String queryAwardKey(Integer awardId);

}
