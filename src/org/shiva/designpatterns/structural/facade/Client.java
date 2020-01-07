package org.shiva.designpatterns.structural.facade;

import org.shiva.designpatterns.structural.facade.model.Product;

public class Client {
    public static void main(String[] args) {
        /*
        Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
        interface that makes the subsystem easier to use.
         */
        final OrderFulfillmentController orderFulfillmentController = new OrderFulfillmentController(new OrderServiceFacadeImpl());
        orderFulfillmentController.orderProduct(new Product(1, "Laptop"));
    }
}
