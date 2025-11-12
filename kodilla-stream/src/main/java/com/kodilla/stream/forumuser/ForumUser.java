package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    final private int id;
    final private String username;
    final private char gender;
    final private LocalDate birthDate;
    final private int postsQuantity;

    public ForumUser(final int id, final String username, final char gender, final LocalDate birthDate, final int postsQuantity) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postsQuantity = postsQuantity;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}
