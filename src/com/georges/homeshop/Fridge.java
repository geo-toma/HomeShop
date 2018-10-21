package com.georges.homeshop;

public class Fridge extends Product {
    private int liter;
    private boolean freezer;

    public Fridge(double price, String descrition, String name, int liter, boolean freezer) {
        super(price, descrition, name);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
