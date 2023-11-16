package com.aloysius.tasklist.service;

import com.aloysius.tasklist.model.User;
import com.aloysius.tasklist.repository.TaskRepository;
import com.aloysius.tasklist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

}
