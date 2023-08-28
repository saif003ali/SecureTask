package com.task.SecureTask.service;

import com.task.SecureTask.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(String title);
    List<Task> getAllTasks();
}
