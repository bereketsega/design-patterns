package main.java.com.structural.composite;

public class Employee implements AbstractEmployee {

    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void info() {
        System.out.println("ID: " + id + " Name: " + name + " Position: " + position);

    }

}
