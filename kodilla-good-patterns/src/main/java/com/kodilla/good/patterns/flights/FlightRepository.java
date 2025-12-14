package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {

    private final Set<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return flights;
    }

}
