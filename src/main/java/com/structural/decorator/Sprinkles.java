package main.java.com.structural.decorator;

public class Sprinkles extends ToppingsDecorator{

    private static final double COST = .50;
    IceCream iceCream;

    public Sprinkles(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return COST + iceCream.cost();
    }

    @Override
    public String description() {
        return iceCream.description() + ", Sprinkles";
    }

}
