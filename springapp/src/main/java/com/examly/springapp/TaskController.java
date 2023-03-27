package com.examly.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class TaskController {


@Autowired

private TaskService taskService;

@PostMapping("/saveTask")

public Task saveTask(@RequestBody Task task) {

return taskService.saveTask(task);
}

@GetMapping("/getTask")

public Task getTaskById(@RequestParam Long id) { 
    return taskService.getTaskById(id);
}

@GetMapping("/alltasks")

public List<Task> getAllTasks() {

return taskService.getAllTasks();
}

@GetMapping("/getTasksByTaskHolderName")

public List<Task> getTasksByTaskHolderName(@RequestParam String taskHolderName) 
{
    return taskService.getTasksByTaskHolderName (taskHolderName);
    
}

@GetMapping("/deleteTask")

public void deleteTaskById(@RequestParam Long id) {

taskService.deleteTaskById(id);
}

@GetMapping("/changeStatus")
public void updateTaskStatus (@RequestParam Long id, @RequestParam String taskStatus)
{

taskService.updateTaskStatus (id, taskStatus);
}
}