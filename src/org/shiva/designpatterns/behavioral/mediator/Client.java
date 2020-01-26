package org.shiva.designpatterns.behavioral.mediator;

import org.shiva.designpatterns.behavioral.mediator.units.SoldierUnit;
import org.shiva.designpatterns.behavioral.mediator.units.TankUnit;

public class Client {
    /*
    Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by
    keeping objects from referring to each other explicitly, and it lets you vary their interaction
    independently
     */
    public static void main(String[] args) {
        final CommanderMediatorImpl commander = new CommanderMediatorImpl();
        final SoldierUnit soldierUnit = new SoldierUnit(commander);
        final TankUnit tankUnit = new TankUnit(commander);

        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);

    }
}
