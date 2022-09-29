package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.Tasks;
import com.perfomatix.training.todo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServiceImpl implements TasksService {
    @Autowired
    private  TasksRepository tasksRepository;



    @Override
    public Tasks saveTasks(Tasks tasks) {
        return tasksRepository.save(tasks);
    }

    @Override
    public List<Tasks> fetchTasksList() {
        return tasksRepository.findAll();
    }

    @Override
    public Tasks fetchTaskById(Integer id) {
        return tasksRepository.findById(id).get();
    }

    @Override
    public Tasks updateTasks(Integer id, Tasks tasks) {
       if (tasksRepository.findById(id).isPresent()){
           Tasks taskDB=tasksRepository.findById(id).get();
           taskDB.setTaskName(tasks.getTaskName());
           taskDB.setStatus(tasks.getStatus());
           taskDB.setCreatedDate(tasks.getCreatedDate());
           taskDB.setModifiedDate(tasks.getModifiedDate());
           taskDB.setActive(tasks.getActive());
           Tasks updatedTasks=tasksRepository.save(taskDB);
           return new Tasks(updatedTasks.getId(),updatedTasks.getTaskName(),updatedTasks.getStatus(),
                   updatedTasks.getCreatedDate(),updatedTasks.getModifiedDate(),updatedTasks.getActive());
       }else {
           return null;
       }
    }

    @Override
    public void deleteTasksById(Integer id) {
        tasksRepository.deleteById(id);
    }

    @Override
    public List<Tasks> fetchIsActiveTasks() {
        return tasksRepository.findAllActiveTasks(true);

    }

    @Override
    public Tasks updateIsActive(Boolean isActive, Tasks tasks) {
        return null;
    }




}







