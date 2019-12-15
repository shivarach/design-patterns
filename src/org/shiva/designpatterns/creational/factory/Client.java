package org.shiva.designpatterns.creational.factory;

public class Client {
    public static void main(String[] args) {
        final BasePizzaFactory pizzaFactory = new PizzaFactory();
        pizzaFactory.createPizza("cheese");
        pizzaFactory.createPizza("veggie");
    }
}
