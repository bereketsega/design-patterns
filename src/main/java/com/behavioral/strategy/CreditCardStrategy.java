package main.java.com.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardHolderName, cardNo, expDate;

    public CreditCardStrategy(String cardHolderName, String cardNo, String expDate) {
        this.cardHolderName = cardHolderName;
        this.cardNo = cardNo;
        this.expDate = expDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " with credit card.");
    }

}
