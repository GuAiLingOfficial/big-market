package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RuleTreeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:规则树节点表DAO
 * @ author: rsl
 * @ create: 2024-07-22 10:25
 **/
@Mapper
public interface IRuleTreeNodeDao {

    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);

    List<RuleTreeNode> queryRuleLocks(String[] treeIds);
}
