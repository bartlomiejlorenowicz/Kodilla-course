package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        // Given
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Task done");

        // Then
        assertEquals("Task to do",
                board.getToDoList().getTasks().get(0));
        assertEquals("Task in progress",
                board.getInProgressList().getTasks().get(0));
        assertEquals("Task done",
                board.getDoneList().getTasks().get(0));
    }
}