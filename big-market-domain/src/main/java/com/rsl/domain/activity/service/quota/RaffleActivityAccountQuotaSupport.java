package com.rsl.domain.activity.service.quota;

import com.rsl.domain.activity.model.entity.ActivityCountEntity;
import com.rsl.domain.activity.model.entity.ActivityEntity;
import com.rsl.domain.activity.model.entity.ActivitySkuEntity;
import com.rsl.domain.activity.repository.IActivityRepository;
import com.rsl.domain.activity.service.quota.rule.factory.DefaultActivityChainFactory;

/**
 * @ description:抽奖活动的支撑类,为抽象类提供服务,例如查询、封装等
 * @ author: rsl
 * @ create: 2024-08-09 15:06
 **/
public class RaffleActivityAccountQuotaSupport {
    protected DefaultActivityChainFactory defaultActivityChainFactory;

    protected IActivityRepository activityRepository;

    public RaffleActivityAccountQuotaSupport(IActivityRepository activityRepository, DefaultActivityChainFactory defaultActivityChainFactory) {
        this.activityRepository = activityRepository;
        this.defaultActivityChainFactory = defaultActivityChainFactory;
    }
    // 通过sku查询活动信息
    public ActivitySkuEntity queryActivitySku(Long sku) {
        return activityRepository.queryActivitySku(sku);
    }
    // 查询活动信息
    public ActivityEntity queryRaffleActivityByActivityId(Long activityId) {
        return activityRepository.queryRaffleActivityByActivityId(activityId);
    }
    //查询次数信息（用户在活动上可参与的次数）
    public ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId) {
        return activityRepository.queryRaffleActivityCountByActivityCountId(activityCountId);
    }

}
