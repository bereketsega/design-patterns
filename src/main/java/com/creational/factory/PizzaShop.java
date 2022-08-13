package main.java.com.creational.factory;

import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter type of pizza \nCheese\nPepperoni\nVeggie\n");
        PizzaFactory pf = new PizzaFactory();
        Pizza order = pf.prepare(input.nextLine());
        if (order != null) order.bake();
    }
}
