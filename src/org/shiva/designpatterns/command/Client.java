package org.shiva.designpatterns.command;

import org.shiva.designpatterns.command.model.BluetoothSpeaker;
import org.shiva.designpatterns.command.model.Light;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        final Light light = new Light();
        commands.add(new LightOnCommand(light));
        commands.add(new LightOffCommand(light));
        commands.add(new BluetoothSpeakerOnCommand(new BluetoothSpeaker()));

        commands.forEach(Command::execute);
    }
}
