package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:抽奖策略DAO
 * @ author: rsl
 * @ create: 2024-07-01 17:03
 **/
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();
}
