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
    private int id;
    private String task_name;
    private String status;
    private Date created_date;
    private Date modified_date;
    private String is_Active;
}
