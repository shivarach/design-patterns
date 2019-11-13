package org.shiva.designpatterns.adapter;

import org.shiva.designpatterns.adapter.model.Volt;

public class ElectricSocket {

    //default 120 volts
    public Volt getVolt(){
        return new Volt(120);
    }
}
