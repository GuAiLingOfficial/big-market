package com.rsl.domain.activity.service;

import com.rsl.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @ description:抽奖活动服务
 * @ author: rsl
 * @ create: 2024-08-08 15:52
 **/
@Service
public class RaffleActivityService extends AbstractRaffleActivity {
    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }

}

