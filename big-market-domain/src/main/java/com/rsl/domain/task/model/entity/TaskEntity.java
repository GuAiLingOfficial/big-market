package com.rsl.domain.task.model.entity;

import lombok.Data;

/**
 * @ description:任务实体对象
 * @ author: rsl
 * @ create: 2024-08-15 16:01
 **/
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}

