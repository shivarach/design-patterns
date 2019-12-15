package org.shiva.designpatterns.creational.factory.pizza;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        addIngredients();
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
