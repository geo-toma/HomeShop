package com.georges.maroc;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String address) {
        System.out.println("je deplace le marocain a "+address+" en taxi");
    }
}
