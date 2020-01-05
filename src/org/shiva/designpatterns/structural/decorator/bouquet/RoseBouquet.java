package org.shiva.designpatterns.structural.decorator.bouquet;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
