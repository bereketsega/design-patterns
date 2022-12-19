package main.java.com.behavioral.visitor;

public interface CarVisitor {
    void visitEngine(Engine e);
    void visitWheel(Wheel w);
}
