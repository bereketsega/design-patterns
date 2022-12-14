package main.java.com.behavioral.observer;

public interface Subject {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();

} 
