package org.homelab;

import org.homelab.api.IOrder;
import org.homelab.config.SpringConfig;
import org.homelab.impl.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //IOrder order = (IOrder) context.getBean("order");
        //IOrder order = (IOrder) context.getBean(Order.class);
        IOrder order = (IOrder) context.getBean("orderDefault");
        order.printOrder();
    }
}
