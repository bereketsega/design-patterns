package main.java.com.structural.adapter;

public class CarAdapter implements Car {

    private Cadillac car = new Cadillac();

    @Override
    public void startEngine() {
        car.pushToStart();
    }
    
}
