package com.kodilla.good.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        // Given
        Logger logger = Logger.INSTANCE;
        logger.log("Enum singleton log");

        // When
        String lastLog = logger.getLastLog();

        // Then
        assertEquals("Enum singleton log", lastLog);
    }
}