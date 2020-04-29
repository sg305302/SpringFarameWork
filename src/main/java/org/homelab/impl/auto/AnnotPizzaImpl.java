package org.homelab.impl.auto;

import org.homelab.impl.auto.annot.AnnotPizza;
import org.homelab.impl.auto.api.IAutoPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@AnnotPizza
@PropertySource("classpath:cena.properties")
public class AnnotPizzaImpl implements IAutoPizza {

    private final int price;
    private final String name;
    private final int weight;

    public AnnotPizzaImpl(@Value("${cena}") int price, @Value("${nazwa}") String name, @Value("300") int weight ) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
