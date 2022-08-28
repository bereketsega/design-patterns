package main.java.com.structural.decorator;

public class IceCreamMaker {

    public static void main(String[] args) {

        IceCream myIceCream = new Vanilla();
        myIceCream = new Sprinkles(myIceCream);
        myIceCream = new HotFudge(myIceCream);

        // print ice cream
        System.out.printf("%s%s\n%s%s\n", "Description: ", myIceCream.description(), "Cost: ", myIceCream.cost());

    }

}
