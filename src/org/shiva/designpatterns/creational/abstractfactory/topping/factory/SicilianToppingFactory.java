package org.shiva.designpatterns.creational.abstractfactory.topping.factory;

import org.shiva.designpatterns.creational.abstractfactory.topping.cheese.Cheese;
import org.shiva.designpatterns.creational.abstractfactory.topping.cheese.MozzarellaCheese;
import org.shiva.designpatterns.creational.abstractfactory.topping.sause.Sauce;
import org.shiva.designpatterns.creational.abstractfactory.topping.sause.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSause() {
        return new TomatoSauce();
    }
}
