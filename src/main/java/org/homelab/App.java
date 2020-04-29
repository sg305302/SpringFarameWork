package org.homelab;

import org.homelab.config.AutoConfig;
import org.homelab.impl.auto.api.IAutoOrder;
import org.homelab.impl.overt.api.IOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*IOrder order = (IOrder) context.getBean("order");
        IOrder order = (IOrder) context.getBean(Order.class);
        IOrder order = (IOrder) context.getBean("orderDefault");
        order.printOrder();*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IAutoOrder autoOrder = (IAutoOrder) context.getBean(IAutoOrder.class);
        IOrder order = (IOrder) context.getBean(IOrder.class);
        autoOrder.printOrder();
        autoOrder.printAnnotOrder();
        autoOrder.printOpenPizza();

        System.out.println("--- Jawna Konfiguracja---");
        order.printOrder();

    }
}
