package org.shiva.designpatterns.structural.decorator.decorator;

import org.shiva.designpatterns.structural.decorator.bouquet.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
