package com.kodilla.good.patterns.strategy.social;


public final class ZGeneration extends User {
    public ZGeneration(String username) {
        super(username, new SnapchatPublisher());
    }
}