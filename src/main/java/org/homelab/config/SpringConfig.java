package org.homelab.config;

import org.homelab.api.IOrder;
import org.homelab.api.IPizza;
import org.homelab.impl.GoodPizza;
import org.homelab.impl.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
To jest jedna z metod
 */
@Configuration
public class SpringConfig {

    @Bean
    public IPizza pizza(){
        return new GoodPizza(115,"GOOD PIZZA");
    }

    @Bean(name = "orderDefault")
    public IOrder order(IPizza pizza){
        return  new Order(pizza);
    }
}
