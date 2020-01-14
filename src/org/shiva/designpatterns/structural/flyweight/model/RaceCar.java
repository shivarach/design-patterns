package org.shiva.designpatterns.structural.flyweight.model;

public abstract class RaceCar {
    /*Intrinsic state  stored and shared in the Flyweight object*/

    protected String name;
    protected int speed;
    protected int horsePower;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    /* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    public abstract void move(int currentX, int currentY, int newX, int newY);
}
