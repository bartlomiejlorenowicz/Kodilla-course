package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //given
        TaskList shopping = new TaskList("toDo", "Shopping");
        taskListDao.save(shopping);

        //when
        List<TaskList> result = taskListDao.findByListName("toDo");
        //then
        assertEquals(1, result.size());

        //cleanUp
        taskListDao.delete(shopping);
    }
}
