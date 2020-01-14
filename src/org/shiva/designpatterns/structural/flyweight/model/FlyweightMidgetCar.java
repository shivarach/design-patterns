package org.shiva.designpatterns.structural.flyweight.model;

public class FlyweightMidgetCar extends RaceCar {

    /*Track number of flyweight instantiation*/
    public static int num;

    public FlyweightMidgetCar(String name, int speed, int horsePower) {
        super(name, speed, horsePower);
        num++;
    }


    /*This method accepts car location (extrinsic). No reference to current
     *or new location is maintained inside the flyweight implementation*/
    @Override
    public void move(int currentX, int currentY, int newX, int newY) {
        System.out.printf("New location of %s is (%d, %d)%n", this.name, newX, newY);
    }
}
