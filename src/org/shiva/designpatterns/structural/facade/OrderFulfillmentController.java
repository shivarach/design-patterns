package org.shiva.designpatterns.structural.facade;

import org.shiva.designpatterns.structural.facade.model.Product;

public class OrderFulfillmentController {
    private OrderServiceFacade orderServiceFacade;

    public OrderFulfillmentController(OrderServiceFacade orderServiceFacade) {

        this.orderServiceFacade = orderServiceFacade;
    }

    public void orderProduct(Product product) {
        orderServiceFacade.placeOrder(product);
    }
}
