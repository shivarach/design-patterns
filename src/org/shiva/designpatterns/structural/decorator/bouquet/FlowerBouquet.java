package org.shiva.designpatterns.structural.decorator.bouquet;

public abstract class FlowerBouquet {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
