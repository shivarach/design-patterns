package org.shiva.designpatterns.adapter;

public class ElectricSocket {

    //default 120 volts
    public Volt getVolt(){
        return new Volt(120);
    }
}
