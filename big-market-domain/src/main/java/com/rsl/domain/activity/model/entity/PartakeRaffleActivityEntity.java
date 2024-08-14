package com.rsl.domain.activity.model.entity;

import lombok.Data;

/**
 * @ description:参与抽奖活动实体对象
 * @ author: rsl
 * @ create: 2024-08-14 15:11
 **/
@Data
public class PartakeRaffleActivityEntity {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}

