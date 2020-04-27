package org.homelab.impl;

import org.homelab.api.IOrder;
import org.homelab.api.IPizza;

public class Order implements IOrder {
    private IPizza pizza;

    public Order(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie:"+pizza.getName());
    }
}
