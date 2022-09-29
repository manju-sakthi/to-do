package com.perfomatix.training.todo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.util.Date;
@Data
@Entity
@Table(name = "tasks_details",schema = "todo")
public class Tasks {
    @Id
    @GeneratedValue
    private Integer id;
    private String taskName;
    private String status;
    private LocalDate createdDate;
    private LocalDate modifiedDate;
    private Boolean isActive;

    public Tasks() {
    }

    public Tasks(Integer id, String taskName, String status, LocalDate createdDate, LocalDate modifiedDate, Boolean isActive) {
        this.id = id;
        this.taskName = taskName;
        this.status = status;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String  toString() {
        return "Tasks{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", isActive=" + isActive +
                '}';
    }
}
