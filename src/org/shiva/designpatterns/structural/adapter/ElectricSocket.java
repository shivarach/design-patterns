package org.shiva.designpatterns.structural.adapter;

import org.shiva.designpatterns.structural.adapter.model.Volt;

public class ElectricSocket {

    //default 120 volts
    public Volt getVolt(){
        return new Volt(120);
    }
}
