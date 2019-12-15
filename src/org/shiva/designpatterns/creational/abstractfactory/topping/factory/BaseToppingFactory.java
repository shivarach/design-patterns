package org.shiva.designpatterns.creational.abstractfactory.topping.factory;

import org.shiva.designpatterns.creational.abstractfactory.topping.cheese.Cheese;
import org.shiva.designpatterns.creational.abstractfactory.topping.sause.Sauce;

public abstract class BaseToppingFactory {

    public abstract Cheese createCheese();

    public abstract Sauce createSause();

}
