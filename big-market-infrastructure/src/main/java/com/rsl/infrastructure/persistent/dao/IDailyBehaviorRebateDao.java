package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.DailyBehaviorRebate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:日常行为返利活动配置
 * @ author: rsl
 * @ create: 2024-08-21 16:06
 **/
@Mapper
public interface IDailyBehaviorRebateDao {

    List<DailyBehaviorRebate> queryDailyBehaviorRebateByBehaviorType(String behaviorType);

}

