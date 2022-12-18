package main.java.com.creational.abstractFactory;

public class CocaColaFactory extends AbstractFactory{

    @Override
    Beverage getBeverageFactory(String beverageType) {
        if (beverageType.equalsIgnoreCase("Zero Sugar")) {
            return new ZeroSugarCocaCola();
        } else if (beverageType.equalsIgnoreCase("Iced")) {
            return new IcedCocaCola();
        }
        return null;
    }
    
}
