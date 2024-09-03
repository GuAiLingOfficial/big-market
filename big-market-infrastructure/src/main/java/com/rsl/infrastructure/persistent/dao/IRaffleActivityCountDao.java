package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:抽奖活动次数配置表Dao
 * @ author: rsl
 * @ create: 2024-08-06 15:12
 **/
@Mapper
public interface IRaffleActivityCountDao {
    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);
}
