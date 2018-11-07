package com.georges.maroc;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String address) {
        System.out.println("je deplace le marocain a "+address+" en bus");
    }
}
