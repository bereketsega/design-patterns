package main.java.com.creational.abstractFactory;

public class Client {
    
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getAbstractFactory("Pepsi");
        Beverage drink = factory.getBeverageFactory("zero sugar");
        drink.produce();

    }

}
