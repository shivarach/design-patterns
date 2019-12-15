package org.shiva.designpatterns.creational.abstractfactory;

import org.shiva.designpatterns.creational.abstractfactory.pizza.Pizza;

public class Client {
    public static void main(String[] args) {
        final BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        pizzaFactory.createPizza("cheese");
        pizzaFactory.createPizza("veggie");

        BasePizzaFactory sicillianPizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = sicillianPizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = sicillianPizzaFactory.createPizza("pepperoni");


    }
}
