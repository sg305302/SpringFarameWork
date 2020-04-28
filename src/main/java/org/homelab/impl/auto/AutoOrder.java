package org.homelab.impl.auto;

import org.homelab.api.IOrder;
import org.homelab.api.IPizza;
import org.homelab.impl.auto.annot.AnnotPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoOrder implements IAutoOrder {

    @Autowired
    private List<IAutoPizza> listOfPizza;

    @Value("#{listOfPizza[1]}")
    private IAutoPizza fromListPizza;

    @Autowired
    @AnnotPizza
    private  IAutoPizza annotPizza;

    private final IAutoPizza pizza;
    private  IPizza openPizza;

    public AutoOrder(@Qualifier("exoticPizza") IAutoPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie:"+pizza.getName() +" c_min: "+pizza.getPrice());
    }

    @Override
    public void printAnnotOrder() {
            System.out.println("Zamowienie Annot:"+annotPizza.getName() +" c: "+annotPizza.getPrice());
    }

    @Override
    public void printOpenPizza() {
        System.out.println("Zamowienie OPEN:"+openPizza.getName() +" c: "+openPizza.getPrice());
        System.out.println("Zamowienie z Lista:"+fromListPizza.getName() +" c: "+fromListPizza.getPrice());

    }

    @Value("#{pizza}") //@Value("#{goodPizza}")
    public void setOpenPizza(IPizza pizza){
        openPizza = pizza;
    }

    //@Autowired TAK TEZ MOZNA
    //@AnnotPizza TAK TEZ MOZNA
    public void setAnnotPizza(IAutoPizza annotPizza) {
        this.annotPizza = annotPizza;
    }
}

