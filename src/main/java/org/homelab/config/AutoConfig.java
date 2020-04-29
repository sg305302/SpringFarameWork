package org.homelab.config;

import org.homelab.impl.auto.ExoticPizza;
import org.homelab.impl.auto.HawaiPizza;
import org.homelab.impl.auto.api.IAutoPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.List;

@Configuration
@ComponentScan("org.homelab.impl.auto") //może być tablica paczek
@Import(OvertConfig.class)
public class AutoConfig {

    @Bean
    public List<IAutoPizza> listOfPizza(){
        return List.of(new ExoticPizza(1, "l_exot",0),new HawaiPizza(2, "l_hawaj",0));
    }
}
