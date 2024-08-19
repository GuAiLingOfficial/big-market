package com.rsl.domain.strategy.service.rule.tree;

import com.rsl.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

import java.util.Date;

/**
 * @ description:规则树接口
 * @ author: rsl
 * @ create: 2024-07-21 10:36
 **/
public interface ILogicTreeNode {
    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue, Date endDateTime);
}
