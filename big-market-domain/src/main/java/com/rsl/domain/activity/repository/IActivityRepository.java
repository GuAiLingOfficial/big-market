package com.rsl.domain.activity.repository;

import com.rsl.domain.activity.model.aggregate.CreateOrderAggregate;
import com.rsl.domain.activity.model.entity.ActivityCountEntity;
import com.rsl.domain.activity.model.entity.ActivityEntity;
import com.rsl.domain.activity.model.entity.ActivitySkuEntity;
/**
 * @ description:活动仓储接口
 * @ author: rsl
 * @ create: 2024-08-08 15:46
 **/
public interface IActivityRepository {

    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateOrderAggregate createOrderAggregate);
}
