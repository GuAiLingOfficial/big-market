package com.rsl.domain.strategy.service.rule;

import com.rsl.domain.strategy.model.entity.RuleActionEntity;
import com.rsl.domain.strategy.model.entity.RuleMatterEntity;

/**
 * rule 下面是实现的整个规则部分的处理，后续可以更好的扩展添加其他规则。
 * @ description:抽奖规则过滤接口
 * @ author: rsl
 * @ create: 2024-07-17 09:29
 **/
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {
    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);
}
