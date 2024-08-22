package com.rsl.trigger.api.dto;

import lombok.Data;

/**
 * @ description:抽奖策略规则，权重配置，查询N次抽奖可解锁奖品范围，请求对象
 * @ author: rsl
 * @ create: 2024-08-22 15:32
 **/
@Data
public class RaffleStrategyRuleWeightRequestDTO {

    // 用户ID
    private String userId;
    // 抽奖活动ID
    private Long activityId;

}

