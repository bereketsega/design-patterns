package main.java.com.structural.composite;

import java.util.ArrayList;

public class Manager implements AbstractEmployee {

    private int id;
    private String name;
    private String position;
    private ArrayList<AbstractEmployee> includedEmployee = new ArrayList<>();

    public Manager(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void info() {
        System.out.println("\nID: " + id + " Name: " + name + " Position: " + position + "\n");
        for (AbstractEmployee employee : includedEmployee) {
            employee.info();
        }
    }

    public void addEmployee(AbstractEmployee employee) {
        includedEmployee.add(employee);
    }

}
