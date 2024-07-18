package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:抽奖策略奖品明细配置DAO
 * @ author: rsl
 * @ create: 2024-07-01 17:03
 **/
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);

    String queryStrategyAwardRuleModels(StrategyAward strategyAward);
}
