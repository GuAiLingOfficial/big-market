package com.rsl.trigger.api.dto;

import lombok.Data;

/**
 * @ description:商品购物车请求对象
 * @ author: rsl
 * @ create: 2024-09-05 08:30
 **/
@Data
public class SkuProductShopCartRequestDTO {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * sku 商品
     */
    private Long sku;

}

