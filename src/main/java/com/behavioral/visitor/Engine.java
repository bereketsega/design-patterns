package main.java.com.behavioral.visitor;

public class Engine implements CarElement{
    final String DESIGN = "four-cylinder";
    final String POWER = "200hp";

    @Override
    public void accept(CarVisitor cv) {
        cv.visitEngine(this);
    }
    
}
