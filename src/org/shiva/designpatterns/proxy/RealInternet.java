package org.shiva.designpatterns.proxy;

public class RealInternet implements Internet {
    @Override
    public void connect(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
