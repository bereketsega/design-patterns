package main.java.com.creational.abstractFactory;

public class PepsiFactory extends AbstractFactory {

    @Override
    Beverage getBeverageFactory(String beverageType) {
        if (beverageType.equalsIgnoreCase("Zero Sugar")) {
            return new ZeroSugarPepsi();
        } else if (beverageType.equalsIgnoreCase("Iced")) {
            return new IcedPepsi();
        }
        return null;
    }

}
