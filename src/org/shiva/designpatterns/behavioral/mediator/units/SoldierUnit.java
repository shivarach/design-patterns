package org.shiva.designpatterns.behavioral.mediator.units;

import org.shiva.designpatterns.behavioral.mediator.CommanderMediator;

public class SoldierUnit implements ArmedUnit {

    private CommanderMediator commanderMediator;

    public SoldierUnit(CommanderMediator commanderMediator) {
        this.commanderMediator = commanderMediator;
    }

    @Override
    public void attack() {
        if (commanderMediator.canAttack()) {
            System.out.println("SoldierUnit: Attacking.....");
            commanderMediator.setAttackStatus(false);
        } else {
            System.out.println("SoldierUnit: Cannot attack now. Other units attacking....");
        }
    }

    @Override
    public void stopAttack() {
        System.out.println("SoldierUnit: Stopped Attacking.....");
        commanderMediator.setAttackStatus(true);

    }
}
