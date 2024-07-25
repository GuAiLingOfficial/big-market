package com.rsl.domain.strategy.service.raffle;

import com.rsl.domain.strategy.model.entity.StrategyAwardEntity;
import com.rsl.domain.strategy.model.valobj.RuleTreeVO;
import com.rsl.domain.strategy.model.valobj.StrategyAwardRuleModelVO;
import com.rsl.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import com.rsl.domain.strategy.repository.IStrategyRepository;
import com.rsl.domain.strategy.service.AbstractRaffleStrategy;
import com.rsl.domain.strategy.service.IRaffleAward;
import com.rsl.domain.strategy.service.IRaffleStock;
import com.rsl.domain.strategy.service.armory.IStrategyDispatch;
import com.rsl.domain.strategy.service.rule.chain.ILogicChain;
import com.rsl.domain.strategy.service.rule.chain.factory.DefaultChainFactory;
import com.rsl.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import com.rsl.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * raffle 是抽奖功能的实现，抽象类是模板模式，定义出标准的抽奖流程*
 *
 * @ description:默认的抽奖策略实现
 * @ author: rsl
 * @ create: 2024-07-17 10:42
 **/
@Slf4j
@Service
public class DefaultRaffleStrategy extends AbstractRaffleStrategy implements IRaffleAward, IRaffleStock {

    public DefaultRaffleStrategy(IStrategyRepository repository, IStrategyDispatch strategyDispatch, DefaultChainFactory defaultChainFactory, DefaultTreeFactory defaultTreeFactory) {
        super(repository, strategyDispatch, defaultChainFactory, defaultTreeFactory);
    }

    @Override
    public DefaultChainFactory.StrategyAwardVO raffleLogicChain(String userId, Long strategyId) {
        ILogicChain logicChain = defaultChainFactory.openLogicChain(strategyId);
        return logicChain.logic(userId, strategyId);
    }

    @Override
    public DefaultTreeFactory.StrategyAwardVO raffleLogicTree(String userId, Long strategyId, Integer awardId) {
        StrategyAwardRuleModelVO strategyAwardRuleModelVO = repository.queryStrategyAwardRuleModelVO(strategyId, awardId);
        if (null == strategyAwardRuleModelVO) {
            return DefaultTreeFactory.StrategyAwardVO.builder().awardId(awardId).build();
        }
        RuleTreeVO ruleTreeVO = repository.queryRuleTreeVOByTreeId(strategyAwardRuleModelVO.getRuleModels());
        if (null == ruleTreeVO) {
            throw new RuntimeException("存在抽奖策略配置的规则模型 Key，未在库表 rule_tree、rule_tree_node、rule_tree_line 配置对应的规则树信息 " + strategyAwardRuleModelVO.getRuleModels());
        }
        IDecisionTreeEngine treeEngine = defaultTreeFactory.openLogicTree(ruleTreeVO);
        return treeEngine.process(userId, strategyId, awardId);
    }

    @Override
    public StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException {
        return repository.takeQueueValue();
    }

    @Override
    public void updateStrategyAwardStock(Long strategyId, Integer awardId) {
        repository.updateStrategyAwardStock(strategyId, awardId);
    }

    @Override
    public List<StrategyAwardEntity> queryRaffleStrategyAwardList(Long strategyId) {
        return repository.queryStrategyAwardList(strategyId);
    }

}
