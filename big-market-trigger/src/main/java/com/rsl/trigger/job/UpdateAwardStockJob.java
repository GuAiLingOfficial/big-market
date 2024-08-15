package com.rsl.trigger.job;
import com.rsl.domain.strategy.model.valobj.StrategyAwardStockKeyVO;
import com.rsl.domain.strategy.service.IRaffleStock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ description:更新奖品库存任务；为了不让更新库存的压力打到数据库中，这里采用了redis更新缓存库存，异步队列更新数据库，数据库表最终一致即可。
 * @ author: rsl
 * @ create: 2024-07-23 11:49
 **/
@Slf4j
@Component()
public class UpdateAwardStockJob {

    @Resource
    private IRaffleStock raffleStock;

    // @Scheduled 注解是 Spring 提供的一种定时任务调度注解，在方法上配置定时任务。
    // 使用 @Scheduled 注解，可以指定一个方法按照某种调度规则定期执行。
    // 每隔 5 秒执行一次标注的方法
    @Scheduled(cron = "0/5 * * * * ?")
    public void exec() {
        try {
//            log.info("定时任务，更新奖品消耗库存【延迟队列获取，降低对数据库的更新频次，不要产生竞争】");
            StrategyAwardStockKeyVO strategyAwardStockKeyVO = raffleStock.takeQueueValue();
            if (null == strategyAwardStockKeyVO) return;
            log.info("定时任务，更新奖品消耗库存 strategyId:{} awardId:{}", strategyAwardStockKeyVO.getStrategyId(), strategyAwardStockKeyVO.getAwardId());
            raffleStock.updateStrategyAwardStock(strategyAwardStockKeyVO.getStrategyId(), strategyAwardStockKeyVO.getAwardId());
        } catch (Exception e) {
            log.error("定时任务，更新奖品消耗库存失败", e);
        }
    }

}

