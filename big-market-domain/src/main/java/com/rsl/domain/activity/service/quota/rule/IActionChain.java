package com.rsl.domain.activity.service.quota.rule;

import com.rsl.domain.activity.model.entity.ActivityCountEntity;
import com.rsl.domain.activity.model.entity.ActivityEntity;
import com.rsl.domain.activity.model.entity.ActivitySkuEntity;

/**
 * @ description:下单规则过滤接口
 * @ author: rsl
 * @ create: 2024-08-09 15:13
 **/
public interface IActionChain extends IActionChainArmory {

    boolean action(ActivitySkuEntity activitySkuEntity, ActivityEntity activityEntity, ActivityCountEntity activityCountEntity);

}
