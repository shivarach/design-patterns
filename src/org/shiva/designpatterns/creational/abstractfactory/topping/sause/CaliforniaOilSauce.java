package org.shiva.designpatterns.creational.abstractfactory.topping.sause;

public class CaliforniaOilSauce implements Sauce {
    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce..");
    }
}
