package com.kodilla.good.patterns.strategy.social;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // Given
        User millenial = new Millenials("Marek");
        User yGen = new YGeneration("Ania");
        User zGen = new ZGeneration("Kuba");

        // When
        String millenialShare = millenial.sharePost();
        String yGenShare = yGen.sharePost();
        String zGenShare = zGen.sharePost();

        // Then
        assertEquals("Facebook", millenialShare);
        assertEquals("Twitter", yGenShare);
        assertEquals("Snapchat", zGenShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        // Given
        User user = new Millenials("Marek");

        // When
        String defaultShare = user.sharePost();
        user.setSocialPublisher(new SnapchatPublisher());
        String afterChangeShare = user.sharePost();

        // Then
        assertEquals("Facebook", defaultShare);
        assertEquals("Snapchat", afterChangeShare);
    }
}
