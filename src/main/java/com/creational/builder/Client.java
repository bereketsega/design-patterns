package main.java.com.creational.builder;

public class Client {
    
    public static void main(String[] args) {
        PizzaBuilder builder;
        HawaiianPizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        builder = hawaiianBuilder;
        
        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(builder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getTopping());
    }
}
