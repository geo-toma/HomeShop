package com.georges;

import com.georges.garage.*;
import com.georges.maroc.*;
import com.georges.homeshop.*;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product(79.99, "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses","Philips HD7866/61");
        Product tv = new Television(599.46,"Smart TV LED incurvee 49/", "TV Samsung", 49,"LED");
        Fridge fridge = new Fridge(189,"Réfrigérateur BEKO 130L - Classe A+ - blanc","BEKO TSE 1042 F", 130, false);

        ((Television) tv).getSize(); //appelation de methode si l'objet est creer depuis la class herite

        Customer customer = new Customer("Sergio Paulo", "Pays, Ville, Quartier, Rue, Imm, App");
        Delivery delivery = new DirectDelivery();

        Bill bill = new Bill(customer, delivery);

        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);

       try {
           bill.generate(new FileWrite("billfile"));
       } catch (NoProductBillException e) {
           System.err.println("il n'ya pas de produit ajoute a la facture");
       }

        /*Vehicule bateau = new Boat("c'est un bateau", "entreprise",200,2020,"modol","blanche", new int[]{1, 2, 3},200);
        bateau.start();
        ((Boat) bateau).floter();

        Bus bus=new Bus();
        Taxi taxi=new Taxi();

        Marocain georges=new Marocain("ma maison");
        georges.seDeplacer(bus);
        System.out.println("");
        georges.seDeplacer(taxi);*/


    }
}
