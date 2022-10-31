package main.java.com.behavioral.strategy;

public class Item {
    private String upCode;
    private int price;

    public Item(String upc, int cost) {
        upCode = upc;
        price = cost;
    }

    public String getUpCode() {
        return upCode;
    }

    public int getPrice() {
        return price;
    }

}
