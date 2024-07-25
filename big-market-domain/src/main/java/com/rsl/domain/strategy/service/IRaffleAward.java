package com.rsl.domain.strategy.service;

import com.rsl.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;

/**
 * @ description:策略奖品接口
 * @ author: rsl
 * @ create: 2024-07-26 00:14
 **/
public interface IRaffleAward {

    /**
     * 根据策略ID查询抽奖奖品列表配置
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId);

}

