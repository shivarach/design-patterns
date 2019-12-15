package org.shiva.designpatterns.creational.abstractfactory;

import org.shiva.designpatterns.creational.abstractfactory.pizza.CheesePizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.PepperoniPizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.Pizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.VeggiePizza;
import org.shiva.designpatterns.creational.abstractfactory.topping.factory.SicilianToppingFactory;

public class SicilianPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        final SicilianToppingFactory sicilianToppingFactory = new SicilianToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(sicilianToppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(sicilianToppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(sicilianToppingFactory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
