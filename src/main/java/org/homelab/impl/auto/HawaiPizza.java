package org.homelab.impl.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // sposobów na jednoznaczność  wybierania komponetu
//@Qualifier("XXX") // sposobów na jednoznaczność  wybierania komponetu
public class HawaiPizza implements IAutoPizza {

    private final int price;
    private final String name;
    private final int weight;

    public HawaiPizza(@Value("777")int price, @Value("Hawajska") String name, @Value("500") int weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
