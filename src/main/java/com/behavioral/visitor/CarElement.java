package main.java.com.behavioral.visitor;

public interface CarElement {
    void accept(CarVisitor cv);
}
