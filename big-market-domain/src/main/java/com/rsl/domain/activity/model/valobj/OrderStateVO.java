package com.rsl.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ description:订单状态枚举值对象（用于描述对象属性的值，如枚举，不影响数据库操作的对象，无生命周期）
 * @ author: rsl
 * @ create: 2024-08-08 15:34
 **/
@Getter
@AllArgsConstructor
public enum OrderStateVO {

    wait_pay("wait_pay", "待支付"),
    completed("completed", "完成"),
    ;


    private final String code;
    private final String desc;

}
