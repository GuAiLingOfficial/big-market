package com.rsl.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ description:活动状态值对象
 * @ author: rsl
 * @ create: 2024-08-08 15:34
 **/
@Getter
@AllArgsConstructor
public enum ActivityStateVO {

    create("create", "创建");

    private final String code;
    private final String desc;

}
