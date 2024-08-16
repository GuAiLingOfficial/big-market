package com.rsl.trigger.api.dto;

import lombok.Data;

/**
 * @ description:活动抽奖请求对象
 * @ author: rsl
 * @ create: 2024-08-16 14:38
 **/
@Data
public class ActivityDrawRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}

