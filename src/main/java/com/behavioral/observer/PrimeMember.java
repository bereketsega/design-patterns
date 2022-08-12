package main.java.com.behavioral.observer;

public class PrimeMember implements Observer{
    
    private String name;

    public PrimeMember(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update() {
        System.out.println("To: " + this.name + ".\n\tNEW! Amazon Prime discount.");
    }

}
