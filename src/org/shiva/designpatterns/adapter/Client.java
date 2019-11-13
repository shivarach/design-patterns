package org.shiva.designpatterns.adapter;

import org.shiva.designpatterns.adapter.model.Volt;

public class Client {
    public static void main(String[] args) {
        final SocketAdapter socketClassAdapter = new SocketClassAdapterImpl();

        final Volt volt3 = socketClassAdapter.get3Volt();
        final Volt volt12 = socketClassAdapter.get12Volt();
        final Volt volt120 = socketClassAdapter.get120Volt();

        System.out.println("v3 volts using Object Adapter = " + volt3.getVolts());
        System.out.println("v12 volts using Object Adapter = " + volt12.getVolts());
        System.out.println("v120 volts using Object Adapter = " + volt120.getVolts());
    }
}
