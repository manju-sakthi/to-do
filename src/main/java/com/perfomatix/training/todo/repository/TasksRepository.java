package com.perfomatix.training.todo.repository;

import com.perfomatix.training.todo.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<Tasks,Integer> {
}
