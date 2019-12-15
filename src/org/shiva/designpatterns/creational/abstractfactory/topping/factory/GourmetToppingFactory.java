package org.shiva.designpatterns.creational.abstractfactory.topping.factory;

import org.shiva.designpatterns.creational.abstractfactory.topping.cheese.Cheese;
import org.shiva.designpatterns.creational.abstractfactory.topping.cheese.GoatCheese;
import org.shiva.designpatterns.creational.abstractfactory.topping.sause.CaliforniaOilSauce;
import org.shiva.designpatterns.creational.abstractfactory.topping.sause.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSause() {
        return new CaliforniaOilSauce();
    }
}
