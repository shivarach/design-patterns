package org.shiva.designpatterns.behavioral.mediator;

import org.shiva.designpatterns.behavioral.mediator.units.ArmedUnit;

public interface CommanderMediator {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankerUnit);
    void setAttackStatus(boolean attackStatus);
    boolean canAttack();
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
