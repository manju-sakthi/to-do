package com.perfomatix.training.todo.contoller;

import com.perfomatix.training.todo.entity.Tasks;
import com.perfomatix.training.todo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {
    @Autowired
    private TasksService tasksService;
    @PostMapping("/Tasks")
    public Tasks saveTasks(@RequestBody Tasks tasks){
      return tasksService.saveTasks(tasks);
    }
}
