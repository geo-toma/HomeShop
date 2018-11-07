package com.georges.miam;

public class Aliment {

    String nom;
    Boolean estCuit;

    public void manger(){
        if (estCuit){
            System.out.println("cet aliment "+nom+" est bien cuit");
        }else
            System.out.println("cet aliment "+nom+" est cru");
    }
}
