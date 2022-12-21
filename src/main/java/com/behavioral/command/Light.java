package main.java.com.behavioral.command;

public class Light {
    private boolean lightState;

    public void switchOn() {
        lightState = true;
    }

    public void switchOff() {
        lightState = false;
    }

    public boolean getLightState() {
        return lightState;
    }
}
