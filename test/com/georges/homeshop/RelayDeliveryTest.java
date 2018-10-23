package com.georges.homeshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {

    @Test
    void Given_FreeRelayNumber_WhenGettingDeliveryPrice_ThenGet0e(){
        Delivery delivery = new RelayDelivery(7);
        assertEquals(0.00, delivery.getPrice(), 0.01);
    }

    @Test
    void Given_LowRelayNumber_WhenGettingDeliveryPrice_ThenGet0e(){
        Delivery delivery = new RelayDelivery(26);
        assertEquals(2.99, delivery.getPrice(), 0.01);
    }

    @Test
    void Given_HighRelayNumber_WhenGettingDeliveryPrice_ThenGet0e(){
        Delivery delivery = new RelayDelivery(49);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }
}