package com.georges.miam;

public class Main {
    public static void main(String[] args) {
        Four grandFour = new Four();
        Aliment cake = new Aliment();
        grandFour.puissance = 50;
        grandFour.capacity=10;

        cake.nom="cake aux fruis";
        grandFour.cuire(cake, 20);
        System.out.println("");
        cake.manger();
    }
}
