package org.shiva.designpatterns.behavioral.command;

import org.shiva.designpatterns.behavioral.command.model.BluetoothSpeaker;

public class BluetoothSpeakerOnCommand implements Command {

    private BluetoothSpeaker bluetoothSpeaker;

    public BluetoothSpeakerOnCommand(BluetoothSpeaker bluetoothSpeaker) {
        this.bluetoothSpeaker = bluetoothSpeaker;
    }

    @Override
    public void execute() {
        bluetoothSpeaker.turnOnBluetooth();
        bluetoothSpeaker.availableForConnection();
        bluetoothSpeaker.connect("Mobile");
    }
}
