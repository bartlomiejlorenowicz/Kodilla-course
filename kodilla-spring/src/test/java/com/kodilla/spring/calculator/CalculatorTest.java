package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        double a = 6;
        double b = 3;

        // When & Then
        assertEquals(9, calculator.add(a, b));
        assertEquals(3, calculator.sub(a, b));
        assertEquals(18, calculator.mul(a, b));
        assertEquals(2, calculator.div(a, b));
    }

}