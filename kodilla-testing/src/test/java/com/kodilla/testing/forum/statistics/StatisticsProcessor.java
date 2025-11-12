package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        avgPostsPerUser = usersCount > 0 ? (double) postsCount / usersCount : 0;
        avgCommentsPerUser = usersCount > 0 ? (double) commentsCount / usersCount : 0;
        avgCommentsPerPost = postsCount > 0 ? (double) commentsCount / postsCount : 0;
    }

    private void showStatistics() {
        System.out.println("Users: " + usersCount);
        System.out.println("Posts: " + postsCount);
        System.out.println("Comments: " + commentsCount);
        System.out.println("Avg posts per user: " + avgPostsPerUser);
        System.out.println("Avg comments per user: " + avgCommentsPerUser);
        System.out.println("Avg comments per post: " + avgCommentsPerPost);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}
