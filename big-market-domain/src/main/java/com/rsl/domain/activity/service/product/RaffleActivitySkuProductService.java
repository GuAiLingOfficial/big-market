package com.rsl.domain.activity.service.product;

import com.rsl.domain.activity.model.entity.SkuProductEntity;
import com.rsl.domain.activity.repository.IActivityRepository;
import com.rsl.domain.activity.service.IRaffleActivitySkuProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ description:sku商品服务
 * @ author: rsl
 * @ create: 2024-09-05 09:16
 **/
@Service
public class RaffleActivitySkuProductService implements IRaffleActivitySkuProductService {

    @Resource
    private IActivityRepository repository;

    @Override
    public List<SkuProductEntity> querySkuProductEntityListByActivityId(Long activityId) {
        return repository.querySkuProductEntityListByActivityId(activityId);
    }

}
