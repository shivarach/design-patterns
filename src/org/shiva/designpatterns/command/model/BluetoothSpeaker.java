package org.shiva.designpatterns.command.model;

public class BluetoothSpeaker {

    public void turnOnBluetooth() {
        System.out.println("Bluetooth speaker turned on");
    }

    public void turnOffBluetooth() {
        System.out.println("Bluetooth speaker turned off");
    }

    public void availableForConnection() {
        System.out.println("Bluetooth speaker is visible to make connections");
    }

    public void connect(String someDevice) {
        System.out.println("Device paired");
    }

    public void disConnect(String someDevice) {
        System.out.println("Device disconnected");
    }
}
