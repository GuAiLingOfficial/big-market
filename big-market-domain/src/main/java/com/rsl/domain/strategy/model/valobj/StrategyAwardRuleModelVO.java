package com.rsl.domain.strategy.model.valobj;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ description:抽奖策略规则规则值对象；值对象，没有唯一ID，仅限于从数据库查询对象
 * @ author: rsl
 * @ create: 2024-07-18 14:29
 **/
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {

    private String ruleModels;

}
