package org.example;

public class Airport implements Informative{
    private static Airport instance = new Airport();

    private Airport() {
    }

    public static Airport getInstance() {
        return instance;
    }

    public String receiveInformation(String information) {
        return "The airport decided about: " + information;
    }
}
