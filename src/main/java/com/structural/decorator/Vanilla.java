package main.java.com.structural.decorator;

public class Vanilla extends IceCream{

    private static final double COST = 4.00;

    public Vanilla() {
        description = "Vanilla Ice Cream";
    }

    @Override
    public double cost() {
        return COST;
    }

}
