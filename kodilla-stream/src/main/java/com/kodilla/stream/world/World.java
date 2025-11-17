package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
