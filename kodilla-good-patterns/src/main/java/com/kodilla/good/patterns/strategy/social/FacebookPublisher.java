package com.kodilla.good.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook";
    }
}
