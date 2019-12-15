package org.shiva.designpatterns.creational.abstractfactory;

import org.shiva.designpatterns.creational.abstractfactory.pizza.CheesePizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.PepperoniPizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.Pizza;
import org.shiva.designpatterns.creational.abstractfactory.pizza.VeggiePizza;
import org.shiva.designpatterns.creational.abstractfactory.topping.factory.BaseToppingFactory;
import org.shiva.designpatterns.creational.abstractfactory.topping.factory.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory= new GourmetToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;

    }
}
