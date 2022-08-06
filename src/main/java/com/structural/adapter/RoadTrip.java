package main.java.com.structural.adapter;

public class RoadTrip {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void startRoadTrip() {
        car.startEngine();
    }
}
