package org.shiva.designpatterns.creational.factory;

import org.shiva.designpatterns.creational.factory.pizza.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
