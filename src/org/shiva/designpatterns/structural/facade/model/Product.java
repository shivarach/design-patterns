package org.shiva.designpatterns.structural.facade.model;

public class Product {
    public int productId;
    public String name;
    public Product(){}
    public Product(int productId, String name){
        this.productId=productId;
        this.name=name;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }
}
