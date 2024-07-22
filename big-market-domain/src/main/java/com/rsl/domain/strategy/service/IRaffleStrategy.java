package com.rsl.domain.strategy.service;

import com.rsl.domain.strategy.model.entity.RaffleAwardEntity;
import com.rsl.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * @ description:抽奖策略接口
 * @ author: rsl
 * @ create: 2024-07-17 09:22
 **/
public interface IRaffleStrategy {

    /**
     * 执行抽奖；用抽奖因子入参，执行抽奖计算，返回奖品信息
     *
     * @param raffleFactorEntity 抽奖因子实体对象，根据入参信息计算抽奖结果
     * @return 抽奖的奖品
     */
    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);
}
