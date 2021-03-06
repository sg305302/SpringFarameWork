package org.homelab.impl.overt;

import org.homelab.impl.overt.api.IPizza;

public class GoodPizza implements IPizza {

    private  int price;
    private final String name;

    public GoodPizza(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
