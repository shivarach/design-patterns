package org.shiva.designpatterns.creational.abstractfactory.pizza;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.shiva.designpatterns.creational.abstractfactory.topping.factory.BaseToppingFactory;

public class VeggiePizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSause();
    }
}
