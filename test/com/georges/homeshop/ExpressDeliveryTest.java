package com.georges.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressDeliveryTest {

    @Test
    public void Given_ParisAsLocation_WhenGettingDeliveryPrice_ThenGet6e99(){
        Delivery delivery = new ExpressDelivery("Paris");
        assertEquals(6.99, delivery.getPrice(), 0.01);
    }

    @Test
    public void Given_OtherCityAsLocation_WhenGettingDeliveryPrice_ThenGet9e99(){
        Delivery delivery = new ExpressDelivery("Bordeau");
        assertEquals(9.99, delivery.getPrice(), 0.01);
    }

}