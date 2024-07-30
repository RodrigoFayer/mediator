package org.example;

public class NavigationMediator {
    public static NavigationMediator instance = new NavigationMediator();

    private NavigationMediator() {
    }

    public static NavigationMediator getInstance() {
        return instance;
    }

    public String notifyTower(String message) {
        return "NavigationMediator received the message: " + Tower.getInstance().receiveInformation(message);
    }

    public String notifyAirport(String message) {
        return "NavigationMediator received the message: " + Airport.getInstance().receiveInformation(message);
    }
}
