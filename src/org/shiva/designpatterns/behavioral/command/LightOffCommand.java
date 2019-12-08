package org.shiva.designpatterns.behavioral.command;

import org.shiva.designpatterns.behavioral.command.model.Light;

public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
