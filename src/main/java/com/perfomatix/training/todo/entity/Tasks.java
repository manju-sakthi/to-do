package com.perfomatix.training.todo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Entity
@Table(name ="TASKS")
public class Tasks {
    @Id
    @GeneratedValue
    private Integer id;
    private String taskName;
    private String status;
    private Date createdDate;
    private Date modifiedDate;
    private Boolean isActive;
}
