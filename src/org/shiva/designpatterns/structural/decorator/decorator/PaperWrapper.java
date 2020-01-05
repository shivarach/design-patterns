package org.shiva.designpatterns.structural.decorator.decorator;

import org.shiva.designpatterns.structural.decorator.bouquet.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }

    @Override
    public double cost() {
        return 3 + flowerBouquet.cost();
    }
}
