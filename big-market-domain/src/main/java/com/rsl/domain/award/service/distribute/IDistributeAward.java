package com.rsl.domain.award.service.distribute;

import com.rsl.domain.award.model.entity.DistributeAwardEntity;

/**
 * @ description:分发奖品接口
 * @ author: rsl
 * @ create: 2024-09-02 09:05
 **/
public interface IDistributeAward {

    void giveOutPrizes(DistributeAwardEntity distributeAwardEntity);

}

