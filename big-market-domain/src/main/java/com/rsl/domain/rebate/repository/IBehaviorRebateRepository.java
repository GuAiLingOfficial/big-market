package com.rsl.domain.rebate.repository;

import com.rsl.domain.rebate.model.aggregate.BehaviorRebateAggregate;
import com.rsl.domain.rebate.model.entity.BehaviorRebateOrderEntity;
import com.rsl.domain.rebate.model.valobj.BehaviorTypeVO;
import com.rsl.domain.rebate.model.valobj.DailyBehaviorRebateVO;

import java.util.List;

/**
 * @ description:行为返利服务仓储接口
 * @ author: rsl
 * @ create: 2024-08-21 16:26
 **/
public interface IBehaviorRebateRepository {

    List<DailyBehaviorRebateVO> queryDailyBehaviorRebateConfig(BehaviorTypeVO behaviorTypeVO);

    void saveUserRebateRecord(String userId, List<BehaviorRebateAggregate> behaviorRebateAggregates);

    List<BehaviorRebateOrderEntity> queryOrderByOutBusinessNo(String userId, String outBusinessNo);

}
