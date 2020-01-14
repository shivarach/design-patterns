package org.shiva.designpatterns.structural.flyweight;

import org.shiva.designpatterns.structural.flyweight.model.RaceCar;

public class RaceCarClient {

    private RaceCar raceCar;

    public RaceCarClient(String name) {
        raceCar = CarFactory.getRaceCar(name);
    }

    /**
     * The extrinsic state of the flyweight is maintained by the client
     */
    private int currentX = 0;
    private int currentY=0;

    public void moveCar(int newX, int newY) {
        raceCar.move(currentX, currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}
