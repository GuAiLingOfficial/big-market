package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:抽奖的策略规则DAO
 * @ author: rsl
 * @ create: 2024-07-01 17:03
 **/
@Mapper
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();
}
