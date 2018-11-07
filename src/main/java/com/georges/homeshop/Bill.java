package com.georges.homeshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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


    //List<List<String>> sentences = new ArrayList<List<String>>();

    public void generate(Writer writer){
        if (products.isEmpty())
            throw new NoProductBillException();
        writer.start();
        writer.writeLine("HomeShop company");
        writer.writeLine("1 place Charles de Georges, ma maison Adress");
        writer.writeLine("");
        writer.writeLine("Facture a l'intension de :");
        writer.writeLine(customer.getFullName());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : "+delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits :");
        writer.writeLine("----------------------------------------------------------------");
        for (Map.Entry<Product, Integer> produit : products.entrySet()){
            Product product = produit.getKey();
            Integer quantity = produit.getValue();
            writer.writeLine(product.getName()+" - "+product.getPrice()+" - "+quantity+" unity");
            writer.writeLine(product.getDescrition());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : "+delivery.getPrice());
        writer.writeLine("----------------------------------------------------------------");
        writer.writeLine("Total : "+getTotal());
        writer.stop();
    }

    public double getTotal(){
        double total = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total+=product.getPrice()*quantity;
        }
        return total;
    }
}
