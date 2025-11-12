package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Adam", 'M', LocalDate.of(1990, 5, 15), 25));
        userList.add(new ForumUser(2, "Anna", 'F', LocalDate.of(1995, 8, 10), 34));
        userList.add(new ForumUser(3, "Marcin", 'M', LocalDate.of(2000, 1, 20), 0));
        userList.add(new ForumUser(4, "Monika", 'F', LocalDate.of(1988, 2, 28), 5));
        userList.add(new ForumUser(5, "Tomasz", 'M', LocalDate.of(2015, 12, 5), 58));
        userList.add(new ForumUser(6, "Dariusz", 'M', LocalDate.of(2005, 11, 1), 13));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
