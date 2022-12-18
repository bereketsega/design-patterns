package main.java.com.creational.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder{

    @Override
    public void builderDough() {
        pizza.setDough("Created Pizza Dough!");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Created Pizza Sauce!");
    }

    @Override
    public void buildTopping() {
    pizza.setTopping("Created Pizza Topping!");
    }
    
}
