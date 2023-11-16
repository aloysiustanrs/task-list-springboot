package com.aloysius.tasklist.controller;

import com.aloysius.tasklist.model.Task;
import com.aloysius.tasklist.security.OAuth;
import com.aloysius.tasklist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    public TaskService taskService;

    @Autowired
    public OAuth oAuth;

    @GetMapping("/api/get-task")
    public String getTask() {

        String currentUserEmail = oAuth.getCurrentUserEmail();

        System.out.println(currentUserEmail);

        List<Task> taskList = taskService.getTaskByEmail(currentUserEmail);

        System.out.println(taskList);

        StringBuilder returnString = new StringBuilder();

        for (Task task: taskList){
            returnString.append(task);
        }


        return returnString.toString();
    }

    @PostMapping("/api/user/add-task")
    public String addTask() {

        return "add task endpoint";
    }
}
