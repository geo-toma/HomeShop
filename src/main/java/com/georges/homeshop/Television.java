package com.georges.homeshop;

public class Television extends Product {
    private int size;
    private String slabType;

    public Television(double price, String descrition, String name, int size, String slabType) {
        super(price, descrition, name);
        this.size = size;
        this.slabType = slabType;
    }

    public int getSize() {
        return size;
    }

    public String getSlabType() {
        return slabType;
    }
    public void allumer(){

    }
}
