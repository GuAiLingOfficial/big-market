package com.rsl.trigger.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:用户活动账户应答对象
 * @ author: rsl
 * @ create: 2024-08-22 15:33
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserActivityAccountResponseDTO {

    /**
     * 总次数
     */
    private Integer totalCount;

    /**
     * 总次数-剩余
     */
    private Integer totalCountSurplus;

    /**
     * 日次数
     */
    private Integer dayCount;

    /**
     * 日次数-剩余
     */
    private Integer dayCountSurplus;

    /**
     * 月次数
     */
    private Integer monthCount;

    /**
     * 月次数-剩余
     */
    private Integer monthCountSurplus;

}

