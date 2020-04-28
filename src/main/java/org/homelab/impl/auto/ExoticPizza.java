package org.homelab.impl.auto;

import org.homelab.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExoticPizza implements IAutoPizza {

    private final int price;
    private final String name;
    private final int weight;
    @Value("#{hawaiPizza.price matches '[1-9][1-9][1-9]'}")
    private boolean match;

    //public ExoticPizza(@Value("18") int price, @Value("exotic") String name, @Value("300") int weight ) {
    //public ExoticPizza(@Value("#{hawaiPizza.getPrice()}") int price, @Value("#{hawaiPizza.getName()?.toUpperCase()}") String name, @Value("300") int weight ) {
    public ExoticPizza(@Value("#{hawaiPizza.price>100? 1: 0}") int price, @Value("#{hawaiPizza.getName()?.toUpperCase()}") String name, @Value("300") int weight ) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name+ " match : "+match;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
