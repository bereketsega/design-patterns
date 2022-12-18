package main.java.com.creational.builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void builderDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
