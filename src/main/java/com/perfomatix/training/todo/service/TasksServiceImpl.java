package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.Tasks;
import com.perfomatix.training.todo.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TasksServiceImpl implements TasksService {
    @Autowired
    private TasksRepository tasksRepository;
    @Override
    public Tasks saveTasks(Tasks tasks) {
        return tasksRepository.save(tasks);
    }
}
