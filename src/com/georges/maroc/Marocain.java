package com.georges.maroc;

public class Marocain {

    private String addr="";

    public Marocain(String addr) {
        this.addr = addr;
    }

    public void seDeplacer(MoyenDeLocomotion moyenDeLocomotion){
        moyenDeLocomotion.deplace(addr);
    }
}
