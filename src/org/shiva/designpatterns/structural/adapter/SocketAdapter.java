package org.shiva.designpatterns.structural.adapter;

import org.shiva.designpatterns.structural.adapter.model.Volt;

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();

}
