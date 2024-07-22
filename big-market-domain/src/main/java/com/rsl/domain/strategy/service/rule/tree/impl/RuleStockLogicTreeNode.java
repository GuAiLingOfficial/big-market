package com.rsl.domain.strategy.service.rule.tree.impl;

import com.rsl.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import com.rsl.domain.strategy.service.rule.tree.ILogicTreeNode;
import com.rsl.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ description:库存扣减节点
 * @ author: rsl
 * @ create: 2024-07-21 10:41
 **/
@Slf4j
@Component("rule_stock")
public class RuleStockLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
                .build();
    }

}
