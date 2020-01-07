package org.shiva.designpatterns.structural.facade;

import org.shiva.designpatterns.structural.facade.model.Product;
import org.shiva.designpatterns.structural.facade.services.InventoryService;
import org.shiva.designpatterns.structural.facade.services.PaymentService;
import org.shiva.designpatterns.structural.facade.services.ShippingService;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
    @Override
    public boolean placeOrder(Product product) {
        boolean orderFulfilled = false;
        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with ID: " + product.productId + " is available.");
            boolean paymentConfirmed = PaymentService.makePayment();
            if (paymentConfirmed) {
                System.out.println("Payment confirmed...");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped...");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;

    }
}
