package org.shiva.designpatterns.behavioral.state.states;

import org.shiva.designpatterns.behavioral.state.CandyVendingMachine;
import org.shiva.designpatterns.behavioral.state.states.CandyVendingMachineState;

public class NoCandyState implements CandyVendingMachineState {
    CandyVendingMachine machine;
    public NoCandyState(CandyVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("No candies available");
    }
    @Override
    public void pressButton() {
        System.out.println("No candies available");
    }
    @Override
    public void dispense() {
        System.out.println("No candies available");
    }
    @Override
    public String toString(){
        return "NoCandyState";
    }

}
