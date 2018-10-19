package com.georges.homeshop;

public class Product {

    private double price;
    private String descrition,name;

    /**
     * Display all the descriptin of the product
     */
    public void look(){

    }

    public String getDescrition() {
        return descrition;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * add the product to the bill
     * @param bill the concerned bill
     * @param quanity the quanity to add
     */
    public void buy(Bill bill, Integer quanity){

    }
}
