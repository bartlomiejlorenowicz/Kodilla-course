package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightService {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights  = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("London", true);
        flights.put("New York", false);
        flights.put("Tokyo", true);
        flights.put("Sydney", false);

        String arrivalAirport = flight.getArrivalAirport();

        if (!flights.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Airport not found: " + arrivalAirport);
        }

        return flights.get(arrivalAirport);
    }

}
