package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.RaffleActivityAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:抽奖活动账户表
 * @ author: rsl
 * @ create: 2024-08-06 15:11
 **/
@Mapper
public interface IRaffleActivityAccountDao {
    void insert(RaffleActivityAccount raffleActivityAccount);

    int updateAccountQuota(RaffleActivityAccount raffleActivityAccount);

}
