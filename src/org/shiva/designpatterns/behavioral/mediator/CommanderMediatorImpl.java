package org.shiva.designpatterns.behavioral.mediator;

import org.shiva.designpatterns.behavioral.mediator.units.ArmedUnit;

public class CommanderMediatorImpl implements CommanderMediator {
    private ArmedUnit soldierUnit;
    private ArmedUnit tankerUnit;
    private boolean attackStatus = true;

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankerUnit) {

        this.soldierUnit = soldierUnit;
        this.tankerUnit = tankerUnit;
    }

    @Override
    public synchronized void setAttackStatus(boolean attackStatus) {

        this.attackStatus = attackStatus;
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        armedUnit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        armedUnit.stopAttack();
    }
}
