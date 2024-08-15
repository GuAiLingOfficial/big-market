package com.rsl.domain.award.service;

import com.rsl.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @ description:奖品服务接口
 * @ author: rsl
 * @ create: 2024-08-15 15:26
 **/
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

}
