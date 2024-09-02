package com.rsl.infrastructure.persistent.dao;

import com.rsl.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ description:奖品表DAO
 * @ author: rsl
 * @ create: 2024-07-01 17:03
 **/
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();

    String queryAwardConfigByAwardId(Integer awardId);

    String queryAwardKeyByAwardId(Integer awardId);

}
