package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Berlin");
        Flight flight2 = new Flight("Rome", "Tokyo");

        FlightService flightService = new FlightService();

        try {
            flightService.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            flightService.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
