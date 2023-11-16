package com.aloysius.tasklist.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @Column(name = "task_name", nullable = false)
    private String taskName;

    @ManyToOne
    @JoinColumn(name = "user_email", referencedColumnName = "user_email")
    private User user;

}