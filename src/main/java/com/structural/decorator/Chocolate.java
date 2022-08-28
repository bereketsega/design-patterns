package main.java.com.structural.decorator;

public class Chocolate extends IceCream{

    private static final double COST = 5.00;

    public Chocolate() {
        description = "Chocolate Ice Cream";
    }

    @Override
    public double cost() {
        return COST;
    }

}
