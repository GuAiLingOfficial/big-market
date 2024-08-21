package com.rsl.domain.rebate.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ description:返利类型（sku 活动库存充值商品、integral 用户活动积分）
 * @ author: rsl
 * @ create: 2024-08-21 17:15
 **/
@Getter
@AllArgsConstructor
public enum RebateTypeVO {

    SKU("sku", "活动库存充值商品"),
    INTEGRAL("integral", "用户活动积分"),
    ;

    private final String code;
    private final String info;

}
