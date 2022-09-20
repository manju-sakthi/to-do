package com.perfomatix.training.todo.entity;

import com.perfomatix.training.todo.entity.audit.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tasks_details",schema = "todo")
public class Tasks extends AbstractBaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String taskName;
    private String status;
}
