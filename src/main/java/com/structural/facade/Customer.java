package main.java.com.structural.facade;

public class Customer {
    private String name;
    private double balance;
    private String address;

    public Customer() {
        name = "";
        balance = 0;
        address = "";
    }

    public Customer(String name, double balance, String address) {
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAddress() {
        return address;
    }

    public double charge(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
            return balance;
        }
        return -1;
    }
}
