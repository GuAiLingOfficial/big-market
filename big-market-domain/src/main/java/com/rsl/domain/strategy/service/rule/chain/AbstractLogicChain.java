package com.rsl.domain.strategy.service.rule.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @ description:抽奖策略责任链，判断走那种抽奖策略。如；默认抽奖、权重抽奖、黑名单抽奖
 * 使用策略模式+简单工厂（相当于策略模式中的环境类）生产对应的责任链
 * AbstractLogicChain是策略模式中的抽象算法类
 * 继承它的类实现具体算法，算法之间可以在环境类中互换，具体算法再组合环境类产生最后的满足需求的方法
 * @ author: rsl
 * @ create: 2024-07-19 16:28
 **/
@Slf4j
public abstract class AbstractLogicChain implements ILogicChain {
    /**
     * 抽象类可以不用实现接口的方法
     */
    private ILogicChain next;

    @Override
    public ILogicChain next() {
        return next;
    }

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    protected abstract String ruleModel();


}

