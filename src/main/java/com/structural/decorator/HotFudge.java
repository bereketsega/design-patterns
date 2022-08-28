package main.java.com.structural.decorator;

public class HotFudge extends ToppingsDecorator{

    private static final double COST = 0.25;
    IceCream iceCream;

    public HotFudge(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return COST + iceCream.cost();
    }

    @Override
    public String description() {
        return iceCream.description() + ", Hot Fudge";
    }

}
