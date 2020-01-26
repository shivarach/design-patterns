package org.shiva.designpatterns.behavioral.mediator.units;

import org.shiva.designpatterns.behavioral.mediator.CommanderMediator;

public class TankUnit implements ArmedUnit {
    private CommanderMediator commanderMediator;

    public TankUnit(CommanderMediator CommanderMediator) {
        this.commanderMediator = CommanderMediator;
    }

    @Override
    public void attack() {
        if (commanderMediator.canAttack()) {
            System.out.println("TankUnit: Attacking.....");
            commanderMediator.setAttackStatus(false);
        } else {
            System.out.println("TankUnit: Cannot attack now. Other units attacking....");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("TankUnit: Stopped attacking.....");
        commanderMediator.setAttackStatus(true);
    }

}
