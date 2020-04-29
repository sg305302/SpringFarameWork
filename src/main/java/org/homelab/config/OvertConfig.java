package org.homelab.config;

import org.homelab.impl.overt.GoodPizza;
import org.homelab.impl.overt.Order;
import org.homelab.impl.overt.api.IOrder;
import org.homelab.impl.overt.api.IPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
To jest jedna z metod
 */
@Configuration
public class OvertConfig {

    @Bean
    public IPizza pizza() {
        return new GoodPizza(115, "GOOD PIZZA");
    }

    @Bean(name = "orderDefault")
    public IOrder order(IPizza pizza) {
        return new Order(pizza);
    }
}
