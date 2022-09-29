package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.Tasks;

import java.util.List;

public interface TasksService {



    public Tasks saveTasks(Tasks tasks);

 public List<Tasks> fetchTasksList();

   public Tasks fetchTaskById(Integer id);


   public Tasks updateTasks(Integer id, Tasks tasks);


   public void deleteTasksById(Integer id);

  public   List<Tasks> fetchIsActiveTasks();

  public   Tasks updateIsActive(Boolean isActive, Tasks tasks);


}
