package com.perfomatix.training.todo.contoller;

import com.perfomatix.training.todo.entity.Tasks;
import com.perfomatix.training.todo.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TasksController {

    @Autowired
    private TasksService tasksService;
    @PostMapping("/Tasks")
    public Tasks saveTasks(@RequestBody Tasks tasks){
      return tasksService.saveTasks(tasks);
    }
    @GetMapping("/Tasks")
    public List<Tasks> fetchTasksList(){
        return tasksService.fetchTasksList();
    }
    @GetMapping("/Tasks/{id}")
    public Tasks fetchTasksById(@PathVariable("id") Integer id){
     return tasksService.fetchTaskById(id);
    }
    @PutMapping("/Tasks/{id}")
    public Tasks updateTasks(@PathVariable("id") Integer id ,@RequestBody Tasks tasks){
        return tasksService.updateTasks(id,tasks);
    }
    @DeleteMapping("/Tasks/{id}")
   public String deleteTasksById(@PathVariable("id") Integer id){
        tasksService.deleteTasksById(id);
        return "DELETED";
   }
    @GetMapping("/Tasks/true")
    public List<Tasks> fetchIsActiveTasks(){
        return tasksService.fetchIsActiveTasks();
    }

}
