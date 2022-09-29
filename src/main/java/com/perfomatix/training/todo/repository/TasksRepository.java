package com.perfomatix.training.todo.repository;

import com.perfomatix.training.todo.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.config.Task;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface TasksRepository extends JpaRepository<Tasks,Integer> {


    @Query("select T from Tasks T where T.isActive is true")
    public List<Tasks> findAllActiveTasks (Boolean isActive);

}
