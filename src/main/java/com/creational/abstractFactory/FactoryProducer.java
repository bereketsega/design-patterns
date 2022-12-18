package main.java.com.creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getAbstractFactory(String beverageFactory) {
        if (beverageFactory.equalsIgnoreCase("Coca Cola")) {
            return new CocaColaFactory();
        } else if (beverageFactory.equalsIgnoreCase("Pepsi")) {
            return new PepsiFactory();
        }
        return null;
    }
    
}
