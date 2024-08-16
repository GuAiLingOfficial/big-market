package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RaffleActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:抽奖活动表Dao
 * @ author: rsl
 * @ create: 2024-08-06 15:12
 **/
@Mapper
public interface IRaffleActivityDao {
    RaffleActivity queryRaffleActivityByActivityId(Long activityId);

    Long queryStrategyIdByActivityId(Long activityId);

    Long queryActivityIdByStrategyId(Long strategyId);

}
