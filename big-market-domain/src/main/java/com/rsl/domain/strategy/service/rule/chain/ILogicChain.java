package com.rsl.domain.strategy.service.rule.chain;

import com.rsl.domain.strategy.service.rule.chain.factory.DefaultChainFactory;

/**
 * @ description:责任链接口
 * @ author: rsl
 * @ create: 2024-07-19 16:23
 **/
public interface ILogicChain extends ILogicChainArmory{
    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品对象
     */
    DefaultChainFactory.StrategyAwardVO logic(String userId, Long strategyId);
}
