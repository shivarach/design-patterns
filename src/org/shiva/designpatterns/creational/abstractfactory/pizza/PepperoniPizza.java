package org.shiva.designpatterns.creational.abstractfactory.pizza;

import org.shiva.designpatterns.creational.abstractfactory.topping.factory.BaseToppingFactory;

public class PepperoniPizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSause();
    }
}
