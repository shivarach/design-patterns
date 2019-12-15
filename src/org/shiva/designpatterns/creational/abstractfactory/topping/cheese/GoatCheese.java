package org.shiva.designpatterns.creational.abstractfactory.topping.cheese;

public class GoatCheese implements Cheese {
    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese...");
    }
}
