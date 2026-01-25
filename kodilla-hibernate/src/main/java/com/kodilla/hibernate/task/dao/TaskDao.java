package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {

    List<Task> findByDuration(int duration);

    @Query(name = "Task.retrieveLongTasks")
    List<Task> retrieveLongTasks();

    @Query(name = "Task.retrieveShortTasks")
    List<Task> retrieveShortTasks();

    @Query(name = "Task.retrieveTasksWithEnoughTime", nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();
}
