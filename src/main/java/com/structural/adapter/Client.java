package main.java.com.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Car myCar = new CarAdapter();
        RoadTrip myRoadTrip = new RoadTrip();
        
        myRoadTrip.setCar(myCar);

        myRoadTrip.startRoadTrip();
    }

}
