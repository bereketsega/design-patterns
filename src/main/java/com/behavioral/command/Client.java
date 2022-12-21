package main.java.com.behavioral.command;

public class Client {
 
    public static void main(String[] args) {
     
        RemoteControl control = new RemoteControl();
        
        Light light = new Light();
        
        LightCommand lightsOn = new LightsOnCommand(light);
        
        LightCommand lightsOff = new LightsOffCommand(light);
        
        //switch on
        control.setCommand(lightsOn);
        
        control.pressButton();
        System.out.println(light.getLightState());
        
        //switch off
        control.setCommand(lightsOff);
        
        control.pressButton();
        System.out.println(light.getLightState());
    }
}
     