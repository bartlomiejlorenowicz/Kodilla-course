package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country france = new Country(new BigDecimal("78000000"));
        Country estonia = new Country(new BigDecimal("134000"));
        Country rpa = new Country(new BigDecimal("65000000"));
        Country etiopia = new Country(new BigDecimal("134000000"));

        Continent africa = new Continent();
        Continent europe = new Continent();

        africa.getCountries().add(rpa);
        africa.getCountries().add(etiopia);

        europe.getCountries().add(poland);
        europe.getCountries().add(germany);
        europe.getCountries().add(france);
        europe.getCountries().add(estonia);

        world.getContinents().add(europe);
        world.getContinents().add(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();

        assertEquals(new BigDecimal("395134000"), result);
    }
}
