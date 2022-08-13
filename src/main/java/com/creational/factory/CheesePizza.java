package main.java.com.creational.factory;

public class CheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Prepared Cheese Pizza.");
    }
}
