package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void notifyTower() {
        Aircraft aircraft = new Aircraft();

        assertEquals("NavigationMediator received the message: The tower decided about: land", aircraft.notifyTower("land"));
    }

    @Test
    void notifyAirport() {
        Aircraft aircraft = new Aircraft();

        assertEquals("NavigationMediator received the message: The airport decided about: delay the flight", aircraft.notifyAirport("delay the flight"));
    }
}