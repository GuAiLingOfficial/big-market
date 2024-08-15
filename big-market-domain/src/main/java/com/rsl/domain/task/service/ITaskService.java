package com.rsl.domain.task.service;

import com.rsl.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @ description:
 * @ author: rsl
 * @ create: 2024-08-15 16:02
 **/
public interface ITaskService {
    /**
     * 查询发送MQ失败和超时1分钟未发送的MQ
     *
     * @return 未发送的任务消息列表10条
     */
    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
