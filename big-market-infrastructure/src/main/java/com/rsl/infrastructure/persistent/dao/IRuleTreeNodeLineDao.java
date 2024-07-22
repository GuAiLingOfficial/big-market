package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:规则树节点连线表DAO
 * @ author: rsl
 * @ create: 2024-07-22 10:25
 **/
@Mapper
public interface IRuleTreeNodeLineDao {

    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);

}
