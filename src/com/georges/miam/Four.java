package com.georges.miam;

public class Four {

    int puissance;
    int capacity;

    public void cuire(Aliment aliment, int temp){
        if (temp < 40 || temp > 250)
            throw new IllegalArgumentException("la temperature doit etre comprise entre 40 et 250 degres");
        System.out.println("je cuit l'aliment "+aliment.nom);
        System.out.println("avec ma capacity de "+capacity+" litres");
        System.out.println("et ma puissance de "+puissance+" watt");
        aliment.estCuit = true;
    }

}
