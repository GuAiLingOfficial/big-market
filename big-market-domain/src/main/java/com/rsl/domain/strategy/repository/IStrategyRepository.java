package com.rsl.domain.strategy.repository;

import com.rsl.domain.strategy.model.entity.StrategyAwardEntity;
import com.rsl.domain.strategy.model.entity.StrategyEntity;
import com.rsl.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.HashMap;
import java.util.List;

/**
 * @ description:策略仓储接口
 * @ author: rsl
 * @ create: 2024-07-02 16:14
 **/
public interface IStrategyRepository {
    /**
     * 查询和缓存策略奖品列表
     *
     * @param strategyId
     * @return 策略奖品实体类
     */
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    /**
     * 存储策略的概率查找表和概率范围值
     *
     * @param key
     * @param rateRange
     * @param shuffleStrategyAwardSearchRateTables
     */
    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, HashMap<Integer, Integer> shuffleStrategyAwardSearchRateTables);

    /**
     * 用于获取策略的概率范围值
     *
     * @param strategyId
     * @return
     */
    int getRateRange(Long strategyId);

    int getRateRange(String key);

    /**
     * 用于获取策略概率查找表中的具体值
     *
     * @param key
     * @param rateKey
     * @return
     */
    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);
}
