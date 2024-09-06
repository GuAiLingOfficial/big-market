package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.UserCreditAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ description:
 * @ author: rsl
 * @ create: 2024-09-02 09:00
 **/
@Mapper
public interface IUserCreditAccountDao {

    void insert(UserCreditAccount userCreditAccountReq);

    int updateAddAmount(UserCreditAccount userCreditAccountReq);

    UserCreditAccount queryUserCreditAccount(UserCreditAccount userCreditAccountReq);

    int updateSubtractionAmount(UserCreditAccount userCreditAccountReq);

}
