package com.kodilla.good.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.BUN_PLAIN)
                .burgers(2)
                .sauce(Bigmac.SAUCE_STANDARD)
                .ingredient(Bigmac.INGREDIENT_LETTUCE)
                .ingredient(Bigmac.INGREDIENT_ONION)
                .ingredient(Bigmac.INGREDIENT_BACON)
                .build();

        System.out.println(bigmac);

        // When
        int ingredientsCount = bigmac.getIngredients().size();

        // Then
        Assertions.assertEquals(Bigmac.BUN_PLAIN, bigmac.getBun());
        Assertions.assertEquals(2, bigmac.getBurgers());
        Assertions.assertEquals(Bigmac.SAUCE_STANDARD, bigmac.getSauce());
        Assertions.assertEquals(3, ingredientsCount);
    }
}
