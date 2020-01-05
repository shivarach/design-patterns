package org.shiva.designpatterns.structural.decorator.decorator;

import org.shiva.designpatterns.structural.decorator.bouquet.FlowerBouquet;

public class RibbonBow extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public double cost() {
        return 6.5 + flowerBouquet.cost();
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", ribbon bow";
    }
}
