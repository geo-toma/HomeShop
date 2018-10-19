package com.georges.miam;

public class Four {

    int puissance;
    int capacity;

    public void cuire(Aliment aliment){
        System.out.println("je cuit l'aliment "+aliment.nom);
        System.out.println("avec ma capacity de "+capacity+" litres");
        System.out.println("et ma puissance de "+puissance+" watt");
        aliment.estCuit = true;
    }

}
