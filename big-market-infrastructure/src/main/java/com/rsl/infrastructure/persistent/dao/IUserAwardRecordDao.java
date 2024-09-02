package com.rsl.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.rsl.infrastructure.persistent.po.UserAwardRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:用户中奖记录表
 * @ author: rsl
 * @ create: 2024-08-14 13:53
 **/
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserAwardRecordDao {

    void insert(UserAwardRecord userAwardRecord);
    int updateAwardRecordCompletedState(UserAwardRecord userAwardRecordReq);

}
