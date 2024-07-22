package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:规则树表DAO
 * @ author: rsl
 * @ create: 2024-07-22 10:24
 **/
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}
