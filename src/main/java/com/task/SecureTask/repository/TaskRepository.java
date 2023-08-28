package com.task.SecureTask.repository;

import com.task.SecureTask.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
