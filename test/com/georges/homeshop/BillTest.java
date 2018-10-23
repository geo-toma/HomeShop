package com.georges.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    private String output;
    private Writer writeMock = new Writer() {
        @Override
        public void start() {
            output="";
        }

        @Override
        public void writeLine(String line) {
            output+=line+"%n";
        }

        @Override
        public void stop() {

        }
    };

    private Product cafe = new Product(79.99, "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses","Philips HD7866/61");
    private Television tv = new Television(599.46,"Smart TV LED incurvee 49/", "TV Samsung", 49,"LED");
    private Fridge fridge = new Fridge(189,"Réfrigérateur BEKO 130L - Classe A+ - blanc","BEKO TSE 1042 F", 130, false);
    private Customer customer = new Customer("MENA Georges", "Rabat Maroc");
    private Delivery wayToDeliver = new ExpressDelivery("Paris");

    @Test
    public void Given_2ProductsToDeliver_WhenWritingFile_ThenGetLineNumber(){
        Bill bill = new Bill(customer, wayToDeliver);
        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.generate(writeMock);
        int lineNumber = output.split("%n").length;
        assertEquals(20, lineNumber);
    }

    @Test
    public void Given_3ProductsToDeliver_WhenWritingFile_ThenGetTotalPrice(){
        Bill bill = new Bill(customer, wayToDeliver);
        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);
        assertEquals(868.45, bill.getTotal(), 0.01);
    }

}