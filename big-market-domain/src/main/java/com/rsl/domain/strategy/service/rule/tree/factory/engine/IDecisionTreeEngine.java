package com.rsl.domain.strategy.service.rule.tree.factory.engine;

import com.rsl.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

import java.util.Date;

/**
 * @ description:规则树组合接口
 * @ author: rsl
 * @ create: 2024-07-21 10:37
 **/
public interface IDecisionTreeEngine {
    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId, Date endDateTime);

}

