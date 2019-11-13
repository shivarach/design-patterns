package org.shiva.designpatterns.adapter;

import org.shiva.designpatterns.adapter.model.Volt;

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();

}
