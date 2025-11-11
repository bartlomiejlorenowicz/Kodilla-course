package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Exterminate Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test: end");
    }

    @DisplayName("Test return true if list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(list);

        //Then
        Assertions.assertTrue(result.isEmpty());
    }


    @DisplayName("Test return list with only even numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(list);

        //Then
        Assertions.assertEquals(List.of(2, 4, 6, 8, 10), result);
        Assertions.assertArrayEquals(new Integer[]{2,4,6,8,10}, result.toArray());
    }

}
