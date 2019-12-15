package org.shiva.designpatterns.creational.factory;

import org.shiva.designpatterns.creational.factory.pizza.CheesePizza;
import org.shiva.designpatterns.creational.factory.pizza.PepperoniPizza;
import org.shiva.designpatterns.creational.factory.pizza.Pizza;
import org.shiva.designpatterns.creational.factory.pizza.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("no such pizza");

        }
        pizza.bakePizza();
        return pizza;
    }
}
