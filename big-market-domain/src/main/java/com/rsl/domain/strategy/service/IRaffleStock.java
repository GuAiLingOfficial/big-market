package com.rsl.domain.strategy.service;
import com.rsl.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
/**
 * @ description:抽奖库存相关服务，获取库存消耗队列
 * @ author: rsl
 * @ create: 2024-07-23 11:52
 **/
public interface IRaffleStock {

    /**
     * 获取奖品库存消耗队列
     *
     * @return 奖品库存Key信息
     * @throws InterruptedException 异常
     */
    StrategyAwardStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 更新奖品库存消耗记录
     *
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     */
    void updateStrategyAwardStock(Long strategyId, Integer awardId);

}

