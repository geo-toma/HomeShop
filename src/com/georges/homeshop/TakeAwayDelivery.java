package com.georges.homeshop;

public class TakeAwayDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "livraison gratuit a l'entrepot";
    }
}
