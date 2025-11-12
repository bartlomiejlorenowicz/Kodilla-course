package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private StatisticsProcessor statisticsProcessor;

    @BeforeEach
    void setup() {
        statisticsProcessor = new StatisticsProcessor();
    }

    private List<String> generateUsers(int n) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            users.add("User" + i);
        }
        return users;
    }

    @Test
    void testWhenPostsCountIsZero() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(5));

        // When
        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(0, statisticsProcessor.getAvgCommentsPerPost());
    }

    @Test
    void testWhenPostsCountIs1000() {
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(10.0, statisticsProcessor.getAvgPostsPerUser());
        assertEquals(20.0, statisticsProcessor.getAvgCommentsPerUser());
        assertEquals(2.0, statisticsProcessor.getAvgCommentsPerPost());
    }

    @Test
    void testWhenCommentsCountIsZero() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(0, statisticsProcessor.getAvgCommentsPerUser());
        assertEquals(0, statisticsProcessor.getAvgCommentsPerPost());
    }

    @Test
    void testWhenCommentsLessThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(10.0, statisticsProcessor.getAvgPostsPerUser());
        assertEquals(5.0, statisticsProcessor.getAvgCommentsPerUser());
        assertEquals(0.5, statisticsProcessor.getAvgCommentsPerPost());
    }

    @Test
    void testWhenCommentsMoreThanPosts() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(10));

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(10.0, statisticsProcessor.getAvgPostsPerUser());
        assertEquals(50.0, statisticsProcessor.getAvgCommentsPerUser());
        assertEquals(5.0, statisticsProcessor.getAvgCommentsPerPost());
    }

    @Test
    void testWhenUsersCountIsZero() {
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(0, statisticsProcessor.getAvgPostsPerUser());
        assertEquals(0, statisticsProcessor.getAvgCommentsPerUser());
    }

    @Test
    void testWhenUsersCountIs100() {
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        when(statisticsMock.usersNames()).thenReturn(generateUsers(100));

        statisticsProcessor.calculateAdvStatistics(statisticsMock);

        assertEquals(10.0, statisticsProcessor.getAvgPostsPerUser());
        assertEquals(50.0, statisticsProcessor.getAvgCommentsPerUser());
        assertEquals(5.0, statisticsProcessor.getAvgCommentsPerPost());
    }

}
