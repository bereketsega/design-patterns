package main.java.com.structural.facade;

public class OrderFacade {

    Kitchen kitchen;
    Delivery delivery;

    public OrderFacade() {
        kitchen = new Kitchen();
        delivery = new Delivery();
    }

    public void placeOrder(Customer customer, String food) {
        double balance = customer.charge(12.99);
        if (balance != -1) {
            kitchen.prepare(food);
            delivery.deliver(customer.getAddress());
        } else {
            System.out.println("Cannot make purchase. Not enough balance.");
        }

    }
}
