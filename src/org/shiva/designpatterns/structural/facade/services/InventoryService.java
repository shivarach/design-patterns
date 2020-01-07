package org.shiva.designpatterns.structural.facade.services;

import org.shiva.designpatterns.structural.facade.model.Product;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}
