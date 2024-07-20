package com.rsl.domain.strategy.service.rule.chain;

/**
 * @ description: 装配接口
 * @ author: rsl
 * @ create: 2024-07-20 14:05
 **/
public interface ILogicChainArmory {
    ILogicChain appendNext(ILogicChain next);

    ILogicChain next();
}
