package com.georges;

import com.georges.garage.Boat;
import com.georges.garage.Vehicule;
import com.georges.homeshop.*;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product(79.99, "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses","Philips HD7866/61");
        Television tv = new Television(599.46,"Smart TV LED incurvee 49/", "TV Samsung", 49,"LED");
        Fridge fridge = new Fridge(189,"Réfrigérateur BEKO 130L - Classe A+ - blanc","BEKO TSE 1042 F", 130, false);

        Customer customer = new Customer("Sergio Paulo", "Pays, Ville, Quartier, Rue, Imm, App");
        Bill bill = new Bill(customer);

        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);

        Vehicule bateau = new Boat("c'est un bateau", "entreprise",200,2020,"modol","blanche", new int[]{1, 2, 3},200);
        bateau.start();

    }
}
