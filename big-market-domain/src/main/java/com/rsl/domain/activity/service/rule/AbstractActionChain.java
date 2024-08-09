package com.rsl.domain.activity.service.rule;

/**
 * @ description:下单规则责任链抽象类
 * @ author: rsl
 * @ create: 2024-08-09 15:15
 **/
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}
