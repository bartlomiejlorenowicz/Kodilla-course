package com.kodilla.good.patterns.strategy.social;


public final class YGeneration extends User {
    public YGeneration(String username) {
        super(username, new TwitterPublisher());
    }
}
