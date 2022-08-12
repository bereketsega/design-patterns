package main.java.com.behavioral.observer;

import java.util.ArrayList;

public class PrimeDiscount implements Subject {

    private final ArrayList<PrimeMember> primeMembers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        primeMembers.add((PrimeMember) observer);
    }

    @Override
    public void remove(Observer observer) {
        primeMembers.remove((PrimeMember) observer);
    }

    @Override
    public void notifyObserver() {
        for (PrimeMember primeUser : primeMembers) {
            primeUser.update();
        }
    }
    
}
