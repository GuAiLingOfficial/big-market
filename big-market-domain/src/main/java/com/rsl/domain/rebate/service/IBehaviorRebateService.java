package com.rsl.domain.rebate.service;

import com.rsl.domain.rebate.model.entity.BehaviorEntity;

import java.util.List;

/**
 * @ description:行为返利服务接口
 * @ author: rsl
 * @ create: 2024-08-21 16:22
 **/
public interface IBehaviorRebateService {

    /**
     * 创建行为动作的入账订单
     *
     * @param behaviorEntity 行为实体对象
     * @return 订单ID
     */
    List<String> createOrder(BehaviorEntity behaviorEntity);

}

