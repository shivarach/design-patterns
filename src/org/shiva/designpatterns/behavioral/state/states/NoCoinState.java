package org.shiva.designpatterns.behavioral.state.states;

import org.shiva.designpatterns.behavioral.state.CandyVendingMachine;

public class NoCoinState implements CandyVendingMachineState {
    CandyVendingMachine candyVendingMachine;

    public NoCoinState(CandyVendingMachine candyVendingMachine) {
        this.candyVendingMachine = candyVendingMachine;
    }

    @Override
    public void insertCoin() {
        candyVendingMachine.setState(candyVendingMachine.getContainsCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

    public String toString() {
        return "NoCoinState";
    }
}
