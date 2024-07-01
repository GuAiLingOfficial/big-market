package com.rsl.infrastructure.persistent.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 抽奖策略奖品明细配置---概率、规则
 */
@Data
public class StrategyAward {

    //自增ID
    Long id;
    //抽奖策略ID
    Long strategyId;
    //抽奖奖品ID-内部流转使用
    Integer awardId;
    //抽奖奖品标题
    String awardTitle;
    //抽奖奖品副标题
    String awardSubTitle;
    //奖品库存总量
    Integer awardCount;
    //奖品库存剩余量
    Integer awardCountSurplus;
    //奖品中将概率
    BigDecimal awardRate;
    //规则模型，rule配置的模型同步到此表，方便使用
    String ruleModels;
    //排序
    Integer sort;
    //创建时间
    Date createTime;
    //更新时间
    Date updateTime;


}
