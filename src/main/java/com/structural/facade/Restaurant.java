package main.java.com.structural.facade;

public class Restaurant {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();
        Customer joe = new Customer("joe", 100.00, "Main St.");

        order.placeOrder(joe, "Burger");
        // System.out.println(joe.getBalance());
    }
}