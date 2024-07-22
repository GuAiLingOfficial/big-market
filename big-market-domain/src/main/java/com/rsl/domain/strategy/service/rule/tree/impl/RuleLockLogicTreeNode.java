package com.rsl.domain.strategy.service.rule.tree.impl;

import com.rsl.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.rsl.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.rsl.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ description:次数锁节点
 * @ author: rsl
 * @ create: 2024-07-21 10:40
 **/
@Slf4j
@Component("rule_lock")
public class RuleLockLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.ALLOW)
                .build();
    }

}


