package com.example.todo.service;

import com.example.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private Long nextId = 1L;

    public List<Task> getAllTasks()
    {
        return new ArrayList<>(tasks.values());
    }

    public Task addTask(Task task)
    {
        task.setId(nextId++);
        tasks.put(task.getId(), task);
        return task;
    }

    public boolean deleteTask(Long id)
    {
        return tasks.remove(id) != null;
    }

    public Task completeTask(Long id)
    {
        Task task = tasks.get(id);
        if (task != null)
        {
            task.setCompleted(true);
        }
        return task;
    }


}
