package main.java.com.behavioral.command;

public class LightsOffCommand implements LightCommand{

    private Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }

}
