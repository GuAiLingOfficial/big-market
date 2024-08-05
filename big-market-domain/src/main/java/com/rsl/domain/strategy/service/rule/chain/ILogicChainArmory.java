package com.rsl.domain.strategy.service.rule.chain;

/**
 * @ description: 责任链装配
 * @ author: rsl
 * @ create: 2024-07-20 14:05
 **/
public interface ILogicChainArmory {

    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);

}


