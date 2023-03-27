package com.examly.springapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="task")
public class Task {

    
    @Id
    
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    
    private Long id;
    
    @Column(name="task_id") 
    private String taskId;
    
    @Column(name ="task_holder_name") 
    private String taskHolderName;
    
    @Column(name="task_date")
    
    private LocalDate taskDate;
    
    @Column(name="task_name")
    
    private String taskName;
    
    @Column(name = "task_status")
    
    private String taskStatus;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskHolderName() {
        return taskHolderName;
    }

    public void setTaskHolderName(String taskHolderName) {
        this.taskHolderName = taskHolderName;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
}