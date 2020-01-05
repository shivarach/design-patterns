package org.shiva.designpatterns.structural.decorator.bouquet;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
