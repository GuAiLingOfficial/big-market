package com.rsl.domain.award.model.aggregate;

import com.rsl.domain.award.model.entity.TaskEntity;
import com.rsl.domain.award.model.entity.UserAwardRecordEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:用户中奖记录聚合对象 【一个聚合代表一个事务操作】
 * @ author: rsl
 * @ create: 2024-08-15 15:42
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAwardRecordAggregate {

    private UserAwardRecordEntity userAwardRecordEntity;

    private TaskEntity taskEntity;

}

