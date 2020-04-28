package org.homelab;

import org.homelab.api.IOrder;
import org.homelab.config.AutoConfig;
import org.homelab.config.SpringConfig;
import org.homelab.impl.Order;
import org.homelab.impl.auto.IAutoOrder;
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
