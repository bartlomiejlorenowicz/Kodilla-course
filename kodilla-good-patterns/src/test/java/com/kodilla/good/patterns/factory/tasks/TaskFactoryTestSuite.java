package com.kodilla.good.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);

        // Then
        Assertions.assertNotNull(shoppingTask);
        Assertions.assertEquals("Buy groceries", shoppingTask.getTaskName());
        Assertions.assertFalse(shoppingTask.isTaskExecuted());

        shoppingTask.executeTask();
        Assertions.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);

        // Then
        Assertions.assertNotNull(paintingTask);
        Assertions.assertEquals("Paint fence", paintingTask.getTaskName());
        Assertions.assertFalse(paintingTask.isTaskExecuted());

        paintingTask.executeTask();
        Assertions.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);

        // Then
        Assertions.assertNotNull(drivingTask);
        Assertions.assertEquals("Drive to work", drivingTask.getTaskName());
        Assertions.assertFalse(drivingTask.isTaskExecuted());

        drivingTask.executeTask();
        Assertions.assertTrue(drivingTask.isTaskExecuted());
    }
}
