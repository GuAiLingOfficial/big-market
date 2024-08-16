package com.rsl.domain.activity.service.armory;

/**
 * @ description:活动装配预热
 * @ author: rsl
 * @ create: 2024-08-12 09:53
 **/
public interface IActivityArmory {

    boolean assembleActivitySku(Long sku);

    boolean assembleActivitySkuByActivityId(Long activityId);
}

