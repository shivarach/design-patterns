package org.shiva.designpatterns.structural.adapter;

import org.shiva.designpatterns.structural.adapter.model.Volt;

//using inheritance for adapter pattern
// other variation is composition of ElectricSocket instead of inheritance
public class SocketClassAdapterImpl extends ElectricSocket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        final Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    private Volt convertVolt(Volt volt, int divider) {
        return new Volt(volt.getVolts() / divider);
    }

    @Override
    public Volt get3Volt() {
        final Volt volt = getVolt();
        return convertVolt(volt, 40);
    }
}
