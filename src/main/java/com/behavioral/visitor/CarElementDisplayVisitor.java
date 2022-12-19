package main.java.com.behavioral.visitor;

public class CarElementDisplayVisitor implements CarVisitor{

    @Override
    public void visitEngine(Engine e) {
        System.out.println("Engine Design: " + e.DESIGN);
        System.out.println("Engine Power: " + e.POWER);
    }

    @Override
    public void visitWheel(Wheel w) {
        System.out.println("Wheel Weight: " + w.WIGHT);
    }
    
}
