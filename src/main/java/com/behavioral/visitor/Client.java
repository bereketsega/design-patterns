package main.java.com.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Engine e = new Engine();
        Wheel w = new Wheel();

        CarVisitor cv = new CarElementDisplayVisitor();
        System.out.println("=========Engine Visitor========");
        e.accept(cv);
        System.out.println();
        System.out.println("=========Wheel Visitor========");
        w.accept(cv);
    }
}