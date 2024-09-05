package com.rsl.trigger.api.dto;

import lombok.Data;

/**
 * @ description:活动抽奖请求对象
 * @ author: rsl
 * @ create: 2024-08-16 14:38
 **/


//设计DTO就是为了和领域中的实体对象隔离开来，使两者各自专门负责自己的功能（DTO对外，Entity对领域内），实现数据防腐
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

