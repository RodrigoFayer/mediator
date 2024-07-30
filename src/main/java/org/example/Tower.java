package org.example;

public class Tower implements Informative{
    private static Tower instance = new Tower();

    private Tower() {
    }

    public static Tower getInstance() {
        return instance;
    }

    public String receiveInformation(String information) {
        return "The tower decided about: " + information;
    }
}
