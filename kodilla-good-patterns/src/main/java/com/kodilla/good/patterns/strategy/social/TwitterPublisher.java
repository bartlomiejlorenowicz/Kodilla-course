package com.kodilla.good.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}
