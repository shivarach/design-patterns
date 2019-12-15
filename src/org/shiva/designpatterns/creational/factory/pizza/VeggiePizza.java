package org.shiva.designpatterns.creational.factory.pizza;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        addIngredients();
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
