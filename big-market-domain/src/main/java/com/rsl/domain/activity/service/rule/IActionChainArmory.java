package com.rsl.domain.activity.service.rule;

/**
 * @ description:责任链装配
 * @ author: rsl
 * @ create: 2024-08-09 15:14
 **/
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
