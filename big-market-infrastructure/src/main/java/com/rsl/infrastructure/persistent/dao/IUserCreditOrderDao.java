package com.rsl.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.rsl.infrastructure.persistent.po.UserCreditOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:用户积分流水单 DAO
 * @ author: rsl
 * @ create: 2024-09-03 09:55
 **/
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {
    void insert(UserCreditOrder userCreditOrderReq);
}

