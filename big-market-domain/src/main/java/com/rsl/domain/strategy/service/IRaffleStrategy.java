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
     * 执行抽奖
     */
    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);
}
