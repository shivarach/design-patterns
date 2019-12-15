package org.shiva.designpatterns.creational.abstractfactory.topping.cheese;

public class MozzarellaCheese implements Cheese {
    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
