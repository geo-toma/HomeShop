package com.georges.garage;

public class Boat extends Vehicule {
    public Boat(String description, String manufacturer, int speed, int year, String modelName, String color, int[] dimension, int weight) {
        super(description, manufacturer, speed, year, modelName, color, dimension, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
