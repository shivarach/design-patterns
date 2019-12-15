package org.shiva.designpatterns.creational.factory.pizza;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        addIngredients();
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
    }
}
