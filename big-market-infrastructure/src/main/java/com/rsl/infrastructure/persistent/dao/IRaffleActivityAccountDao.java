package com.rsl.infrastructure.persistent.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouter;
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

    @DBRouter
    RaffleActivityAccount queryActivityAccountByUserId(RaffleActivityAccount raffleActivityAccountReq);
    //更新账户额度
    int updateActivityAccountSubtractionQuota(RaffleActivityAccount raffleActivityAccount);
    //更新总账户里的月额度的镜像额度？
    void updateActivityAccountMonthSurplusImageQuota(RaffleActivityAccount raffleActivityAccount);
    //更新总账户里的日额度的镜像额度？
    void updateActivityAccountDaySurplusImageQuota(RaffleActivityAccount raffleActivityAccount);


}
