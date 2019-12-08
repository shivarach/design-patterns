package org.shiva.designpatterns.behavioral.command;

import org.shiva.designpatterns.behavioral.command.model.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
