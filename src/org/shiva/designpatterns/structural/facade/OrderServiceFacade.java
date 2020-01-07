package org.shiva.designpatterns.structural.facade;

import org.shiva.designpatterns.structural.facade.model.Product;

public interface OrderServiceFacade {
    boolean placeOrder(Product product);
}
