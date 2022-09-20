package com.perfomatix.training.todo.repository;

import com.perfomatix.training.todo.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import java.util.Optional;

/**
 * @author Thariq
 * @created 19-09-2022
 **/
public interface TasksRepository extends JpaRepository<Tasks,Long> {
}
