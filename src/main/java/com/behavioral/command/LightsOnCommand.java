package main.java.com.behavioral.command;

public class LightsOnCommand implements LightCommand{
    
    private Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }

}
