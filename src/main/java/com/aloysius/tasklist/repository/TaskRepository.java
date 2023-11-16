package com.aloysius.tasklist.repository;


import com.aloysius.tasklist.model.Task;
import com.aloysius.tasklist.security.OAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query("SELECT t FROM Task t WHERE t.user.userEmail = :userEmail")
    List<Task> findTasksByUserEmail(@Param("userEmail") String userEmail);

}
