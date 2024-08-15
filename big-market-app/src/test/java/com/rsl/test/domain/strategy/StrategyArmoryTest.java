package com.rsl.test.domain.strategy;

import com.rsl.domain.strategy.service.armory.IStrategyArmory;
import com.rsl.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ description:测试装配
 * @ author: rsl
 * @ create: 2024-07-02 18:00
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryTest {
    @Resource
    private IStrategyArmory strategyArmory;
    @Resource
    private IStrategyDispatch strategyDispatch;

    @Test
    public void testStrategyArmory(){
        strategyArmory.assembleLotteryStrategy(100002L);
    }

    @Test
    public void testGetAssembleRandomVal(){
        log.info("测试结果：{} - 奖品ID值",strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID值",strategyDispatch.getRandomAwardId(100002L));
        log.info("测试结果：{} - 奖品ID值",strategyDispatch.getRandomAwardId(100002L));
    }
}