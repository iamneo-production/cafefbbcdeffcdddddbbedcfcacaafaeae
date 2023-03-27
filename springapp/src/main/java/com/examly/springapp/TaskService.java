package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {

@Autowired
private TaskRepository taskRepository;

public Task saveTask(Task task) { 
    
    return taskRepository.save(task);
}

public Task getTaskById(Long id) {

return taskRepository.findById(id).orElse(null);
}

public List<Task> getAllTasks() {
     return taskRepository.findAll();
}

public List<Task> getTasksByTaskHolderName(String taskHolderName) {

return taskRepository.findByTaskHolderName (taskHolderName);
}

public void deleteTaskById(Long id) { 
    taskRepository.deleteById(id);
}
    
public void updateTaskStatus (Long id, String taskStatus) {

    Task task=taskRepository.findById(id).orElse(null);
    
    if (task != null) {
    
    task.setTaskStatus(taskStatus);
    
    taskRepository.save(task);
}
}
}