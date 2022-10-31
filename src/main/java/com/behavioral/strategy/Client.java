package main.java.com.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 20);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal;
        cart.pay(new PayPalStrategy("email@example.com", "password"));

        // pay by credit card;
        cart.pay(new CreditCardStrategy("123456789012", "345", "03/26"));

    }
}
