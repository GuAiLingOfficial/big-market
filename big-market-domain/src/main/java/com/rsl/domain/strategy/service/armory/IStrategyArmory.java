package com.rsl.domain.strategy.service.armory;

/**
 * @ description:策略装配工厂，负责初始化策略计算，只执行抽奖策略装配
 * @ author: rsl
 * @ create: 2024-07-02 16:09
 **/
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     * 将奖品概率分布装配到redis中
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

    boolean  assembleLotteryStrategyByActivityId(Long activityId);
}
