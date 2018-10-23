package com.georges;

import com.georges.garage.Boat;
import com.georges.garage.Vehicule;
import com.georges.homeshop.*;
import com.georges.maroc.Bus;
import com.georges.maroc.Marocain;
import com.georges.maroc.Taxi;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product(79.99, "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses","Philips HD7866/61");
        Television tv = new Television(599.46,"Smart TV LED incurvee 49/", "TV Samsung", 49,"LED");
        Fridge fridge = new Fridge(189,"Réfrigérateur BEKO 130L - Classe A+ - blanc","BEKO TSE 1042 F", 130, false);

        Customer customer = new Customer("Sergio Paulo", "Pays, Ville, Quartier, Rue, Imm, App");
        Delivery delivery = new DirectDelivery();

        Bill bill = new Bill(customer, delivery);

        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);

        bill.generate(new FileWrite("billfile"));

       /** Vehicule bateau = new Boat("c'est un bateau", "entreprise",200,2020,"modol","blanche", new int[]{1, 2, 3},200);
        bateau.start();

        Bus bus=new Bus();
        Taxi taxi=new Taxi();

        Marocain georges=new Marocain("ma maison");
        georges.seDeplacer(bus);
        System.out.println("");
        georges.seDeplacer(taxi);*/

    }
}
