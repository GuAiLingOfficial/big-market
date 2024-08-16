package com.rsl.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:活动抽奖响应对象
 * @ author: rsl
 * @ create: 2024-08-16 14:39
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDrawResponseDTO {

    // 奖品ID
    private Integer awardId;
    // 奖品标题
    private String awardTitle;
    // 排序编号【策略奖品配置的奖品顺序编号】
    private Integer awardIndex;

}
