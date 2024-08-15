package com.rsl.domain.task.repository;

import com.rsl.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @ description:任务服务仓储接口
 * @ author: rsl
 * @ create: 2024-08-15 16:07
 **/
public interface ITaskRepository {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}

