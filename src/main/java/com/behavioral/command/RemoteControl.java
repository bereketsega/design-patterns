package main.java.com.behavioral.command;
//Invoker
public class RemoteControl {

    private LightCommand lightCommand;

    public void setCommand(LightCommand lightCommand) {
        this.lightCommand = lightCommand;
    }

    public void pressButton() {
        lightCommand.execute();
    }
    
}
