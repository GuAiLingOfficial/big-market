package com.rsl.domain.rebate.model.aggregate;

import com.rsl.domain.rebate.model.entity.BehaviorRebateOrderEntity;
import com.rsl.domain.rebate.model.entity.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:行为返利聚合对象
 * @ author: rsl
 * @ create: 2024-08-21 16:21
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BehaviorRebateAggregate {

    /** 用户ID */
    private String userId;
    /** 行为返利订单实体对象 */
    private BehaviorRebateOrderEntity behaviorRebateOrderEntity;
    /** 任务实体对象 */
    private TaskEntity taskEntity;

}
