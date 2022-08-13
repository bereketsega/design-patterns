package main.java.com.creational.factory;

public class VeggiePizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Prepared Veggie Pizza.");
    }
}
