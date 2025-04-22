package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService)
    {
        this.taskService = taskService;
    }

    @PostMapping
    public Task addTask(@RequestBody Task task)
    {
        return  taskService.addTask(task);
    }

    @PutMapping ("/{id}/complete")
    public Task completeTask(@PathVariable Long id)
    {
        return taskService.completeTask(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id)
    {
        boolean deleted = taskService.deleteTask(id);
        if (deleted)
        {
            return ResponseEntity.ok("Task deleted successfully.");
        }   else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");
        }
    }




}
