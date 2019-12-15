package org.shiva.designpatterns.creational.abstractfactory.pizza;

import org.shiva.designpatterns.creational.abstractfactory.topping.factory.BaseToppingFactory;

public class CheesePizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSause();
    }
}
