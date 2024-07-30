package org.example;

public class Aircraft {
    public String notifyTower(String message) {
        return NavigationMediator.getInstance().notifyTower(message);
    }

    public String notifyAirport(String message) {
        return NavigationMediator.getInstance().notifyAirport(message);
    }
}
