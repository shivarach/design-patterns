package org.shiva.designpatterns.structural.flyweight;

import org.shiva.designpatterns.structural.flyweight.model.FlyweightMidgetCar;
import org.shiva.designpatterns.structural.flyweight.model.FlyweightSprintCar;
import org.shiva.designpatterns.structural.flyweight.model.RaceCar;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static Map<String, RaceCar> flyweights = new HashMap<>();

    /*If key exist, return flyweight from Map*/
    public static RaceCar getRaceCar(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }
        RaceCar raceCar;
        /*If key does not exist in Map, create flyweight, put it in Map, and return the object*/
        switch (key) {
            case "Midget":
                raceCar = new FlyweightMidgetCar("Midget Car", 140, 400);
                break;
            case "Sprint":
                raceCar = new FlyweightSprintCar("Sprint Car", 160, 1000);
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type.");
        }
        flyweights.put(key, raceCar);
        return raceCar;
    }

}
