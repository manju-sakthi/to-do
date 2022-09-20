package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.Tasks;
import com.perfomatix.training.todo.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Thariq
 * @created 19-09-2022
 **/
@RequiredArgsConstructor
@Slf4j
@Service
public class TaskService {

    private final TasksRepository tasksRepository;

    public Tasks findAtask(Long id){
        return tasksRepository.findById(id).orElse(new Tasks());
    }
}
