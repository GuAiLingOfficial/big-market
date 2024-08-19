package com.rsl.domain.activity.service;

import com.rsl.domain.activity.model.valobj.ActivitySkuStockKeyVO;

import java.util.List;

/**
 * @ description:活动sku库存处理接口
 * @ author: rsl
 * @ create: 2024-08-12 10:39
 **/
public interface IRaffleActivitySkuStockService  {

    /**
     * 获取活动sku库存消耗队列
     *
     * @return 奖品库存Key信息
     * @throws InterruptedException 异常
     */
    ActivitySkuStockKeyVO takeQueueValue() throws InterruptedException;

    /**
     * 获取活动sku库存消耗队列
     *
     * @param sku 指定sku
     * @return 奖品库存Key信息
     * @throws InterruptedException 异常
     */
    ActivitySkuStockKeyVO takeQueueValue(Long sku) throws InterruptedException;


    /**
     * 清空队列
     */
    void clearQueueValue();

    /**
     * 清空队列
     *
     * @param sku 指定sku
     */
    void clearQueueValue(Long sku);


    /**
     * 延迟队列 + 任务趋势更新活动sku库存
     *
     * @param sku 活动商品
     */
    void updateActivitySkuStock(Long sku);

    /**
     * 缓存库存消耗完毕，清空数据库库存
     *
     * @param sku 活动商品
     */
    void clearActivitySkuStock(Long sku);

    List<Long> querySkuList();

}
