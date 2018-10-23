package com.georges.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {

    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * add the product and his quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product,quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
