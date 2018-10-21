package com.georges.garage;

public class Vehicule {
    private String description, manufacturer;
    private int speed, year;
    private String modelName, color;
    private int[] dimension = new int[3];
    private int weight;

    public Vehicule(String description, String manufacturer, int speed, int year, String modelName, String color, int[] dimension, int weight) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.year = year;
        this.modelName = modelName;
        this.color = color;
        this.dimension = dimension;
        this.weight = weight;
    }

    public void start(){
        System.out.println("je demare");
    }
    public void stop(){
        System.out.println("je m'arete");
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }
}
