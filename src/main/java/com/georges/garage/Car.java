package com.georges.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule{
    private String motor;
    private int door, literPer100km;
    private List<String> options = new ArrayList<String>();

    public Car(String description, String manufacturer, int speed, int year, String modelName, String color, int[] dimension, int weight, String motor, int door, int literPer100km, List<String> options) {
        super(description, manufacturer, speed, year, modelName, color, dimension, weight);
        this.motor = motor;
        this.door = door;
        this.literPer100km = literPer100km;
        this.options = options;
    }

    @Override
    public void start(){
        System.out.println("je suis "+modelName+" je consome "+literPer100km+" litres au 100 km et je demare");
    }

    @Override
    public void stop(){
        System.out.println("je suis "+getModelName()+" et j'arrete mon moteur "+motor);
    }

    public void startHeadLight(){
        System.out.println("j'allume la lumiere");
    }

    public void openTrunk(){
        System.out.println("j'ouvre le capot");
    }

    public String getMotor() {
        return motor;
    }

    public int getDoor() {
        return door;
    }

    public int getLiterPer100km() {
        return literPer100km;
    }

    public List<String> getOptions() {
        return options;
    }
}
