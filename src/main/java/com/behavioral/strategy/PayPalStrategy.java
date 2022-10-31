package main.java.com.behavioral.strategy;

public class PayPalStrategy implements PaymentStrategy {
    private String emailID, password;

    public PayPalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with paypal.");
    }
}
