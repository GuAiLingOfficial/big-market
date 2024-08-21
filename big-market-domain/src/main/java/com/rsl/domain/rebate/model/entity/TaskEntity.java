package com.rsl.domain.rebate.model.entity;

import com.rsl.domain.rebate.event.SendRebateMessageEvent;
import com.rsl.domain.rebate.model.valobj.TaskStateVO;
import com.rsl.types.event.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ description:任务实体对象
 * @ author: rsl
 * @ create: 2024-08-21 16:18
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private BaseEvent.EventMessage<SendRebateMessageEvent.RebateMessage> message;
    /** 任务状态；create-创建、completed-完成、fail-失败 */
    private TaskStateVO state;

}

