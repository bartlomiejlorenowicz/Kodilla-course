package com.kodilla.good.patterns.strategy.social;

public final class Millenials extends User {
    public Millenials(String username) {
        super(username, new FacebookPublisher());
    }
}
