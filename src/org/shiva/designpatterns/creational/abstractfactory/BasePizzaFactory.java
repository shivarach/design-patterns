package org.shiva.designpatterns.creational.abstractfactory;

import org.shiva.designpatterns.creational.abstractfactory.pizza.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
