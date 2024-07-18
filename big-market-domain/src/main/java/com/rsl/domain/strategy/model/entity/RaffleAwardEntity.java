package com.rsl.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:抽奖奖品实体 performRaffle出参
 * @ author: rsl
 * @ create: 2024-07-17 09:25
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleAwardEntity {
    /**
     * 策略ID
     */
    private Long strategyId;
    /**
     * 奖品ID
     */
    private Integer awardId;
    /**
     * 奖品对接标识 - 每一个都是一个对应的发奖策略
     */
    private String awardKey;
    /**
     * 奖品配置信息
     */
    private String awardConfig;
    /**
     * 奖品内容描述
     */
    private String awardDesc;

}
