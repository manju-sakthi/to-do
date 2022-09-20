package com.perfomatix.training.todo.entity;

import com.perfomatix.training.todo.entity.audit.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thariq
 * @created 19-09-2022
 **/

@Data
@Entity
@Table(name = "TASKS")
public class Animals extends AbstractBaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
