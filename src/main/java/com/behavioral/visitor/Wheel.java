package main.java.com.behavioral.visitor;

public class Wheel implements CarElement {
    final int WIGHT = 30; //pounds
    @Override
    public void accept(CarVisitor cv) {
        cv.visitWheel(this);
    }

}
