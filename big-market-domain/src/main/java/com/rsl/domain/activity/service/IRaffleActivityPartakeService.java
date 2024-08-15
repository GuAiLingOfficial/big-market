package com.rsl.domain.activity.service;

import com.rsl.domain.activity.model.entity.PartakeRaffleActivityEntity;
import com.rsl.domain.activity.model.entity.UserRaffleOrderEntity;

/**
 * @ description:抽奖活动参与服务
 * @ author: rsl
 * @ create: 2024-08-14 14:55
 **/
public interface IRaffleActivityPartakeService {
    /**
     * 创建抽奖单；用户参与抽奖活动，扣减活动账户库存，产生抽奖单。如存在未被使用的抽奖单则直接返回已存在的抽奖单。
     *
     * @param partakeRaffleActivityEntity 参与抽奖活动实体对象
     * @return 用户抽奖订单实体对象
     */
    UserRaffleOrderEntity createOrder(PartakeRaffleActivityEntity partakeRaffleActivityEntity);


}