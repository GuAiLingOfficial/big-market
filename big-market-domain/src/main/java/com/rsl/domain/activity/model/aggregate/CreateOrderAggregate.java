package com.rsl.domain.activity.model.aggregate;

import com.rsl.domain.activity.model.entity.ActivityAccountEntity;
import com.rsl.domain.activity.model.entity.ActivityOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:下单聚合对象
 * @ author: rsl
 * @ create: 2024-08-08 15:38
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderAggregate {

    /**
     * 活动账户实体
     */
    private ActivityAccountEntity activityAccountEntity;
    /**
     * 活动订单实体
     */
    private ActivityOrderEntity activityOrderEntity;

}
