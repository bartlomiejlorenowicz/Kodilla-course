package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchService {

    public Set<Flight> findFlightsFrom(Set<Flight> flights, String city) {
        return flights.stream()
                .filter((flight -> flight.getDeparture().equals(city)))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightsTo(Set<Flight> flights, String city) {
        return flights.stream()
                .filter(flight -> flight.getArrival().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightBetween(Set<Flight> flights, String from, String to) {
        return flights.stream()
                .filter(flightFrom -> flightFrom.getDeparture().equals(from) &&
                        flights.stream().anyMatch(flightTo -> flightTo.getDeparture().equals(flightFrom.getArrival())
                        && flightTo.getArrival().equals(to))
                )
                .flatMap(flightFrom -> flights.stream()
                        .filter(flightTo -> flightTo.getDeparture().equals(flightFrom.getArrival())
                                && flightTo.getArrival().equals(to))
                )
                .collect(Collectors.toSet());
    }

}

