package com.rsl.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:活动账户（月）实体对象
 * @ author: rsl
 * @ create: 2024-08-14 15:11
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityAccountMonthEntity {

    /** 用户ID */
    private String userId;
    /** 活动ID */
    private Long activityId;
    /** 月（yyyy-mm） */
    private String month;
    /** 月次数 */
    private Integer monthCount;
    /** 月次数-剩余 */
    private Integer monthCountSurplus;

}
