package com.aloysius.tasklist.service;

import com.aloysius.tasklist.model.Task;
import com.aloysius.tasklist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    public TaskRepository taskRepository;


    public List<Task> getTask(){
        return taskRepository.findAll();
    }

    public List<Task> getTaskByEmail(String email){
        return taskRepository.findTasksByUserEmail(email);
    }


    public void addTask(Task task){
        taskRepository.save(task);
    }


    public void deleteTask(Task task){
        taskRepository.delete(task);
    }




}
