package com.rsl.domain.strategy.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ description:规则过滤校验类型值对象
 * @ author: rsl
 * @ create: 2024-07-17 09:58
 **/
@Getter
@AllArgsConstructor
public enum RuleLogicCheckTypeVO {
    ALLOW("0000", "放行；执行后续的流程，不受规则引擎影响"),

    TAKE_OVER("0001", "接管；后续的流程，受规则引擎执行结果影响"),
    ;

    private final String code;
    private final String info;


}
