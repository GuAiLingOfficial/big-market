package com.rsl.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:出货单实体对象
 * @ author: rsl
 * @ create: 2024-09-04 11:52
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryOrderEntity {

    /**
     * 用户ID
     */
    private String userId;
    /**
     * 业务仿重ID - 外部透传。返利、行为等唯一标识
     */
    private String outBusinessNo;

}
