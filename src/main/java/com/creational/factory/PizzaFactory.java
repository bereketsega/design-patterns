package main.java.com.creational.factory;

public class PizzaFactory {
    public Pizza prepare(String pizza) {
        if (pizza.equalsIgnoreCase("Cheese")) {
            return new CheesePizza();
        } else if (pizza.equalsIgnoreCase("Veggie")) {
            return new VeggiePizza();
        } else if (pizza.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        }
        return null;
    }
}
