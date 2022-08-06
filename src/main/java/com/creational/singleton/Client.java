package main.java.com.creational.singleton;


public class Client {
    public static void main(String[] args) {
        CoinFlipper coinFlipper = CoinFlipper.getInstance();
        System.out.println(coinFlipper.flipCoin());
    }
}
