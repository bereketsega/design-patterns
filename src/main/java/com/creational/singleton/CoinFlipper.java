package main.java.com.creational.singleton;

import java.util.Random;

public class CoinFlipper {
    
    private static CoinFlipper instance; // single class instance
    private static Random random; // to store a random number, 0 or 1

    /**
     * constructor not accessible
     */
    private CoinFlipper() {

    }

    /**
     * generates or returns the single class instance
     * @return the only instance of the class
     */
    public static CoinFlipper getInstance() {
        if (instance == null) {
            instance = new CoinFlipper();
        } 
        return instance;
    }

    /**
     * generate a random number, either 0 or 1
     * @return Heads if 1, else Tails
     */
    public String flipCoin() {
        random = new Random();
        int number = random.nextInt(2);
        if (number == 1) {
            return "Heads";
        }
        return "Tails";
    }

}
