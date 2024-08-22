package com.rsl.trigger.api.dto;

import lombok.Data;

/**
 * @ description:用户活动账户请求对象
 * @ author: rsl
 * @ create: 2024-08-22 15:33
 **/
@Data
public class UserActivityAccountRequestDTO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}

