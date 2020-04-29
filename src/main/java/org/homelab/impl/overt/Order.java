package org.homelab.impl.overt;

import org.homelab.impl.overt.api.IOrder;
import org.homelab.impl.overt.api.IPizza;

public class Order implements IOrder {
    private IPizza pizza;

    public Order(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie:"+pizza.getName());
    }
}
