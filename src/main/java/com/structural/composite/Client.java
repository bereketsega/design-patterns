package main.java.com.structural.composite;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        Employee eric = new Employee(1, "Eric", "Business Analyst");
        Employee monica = new Employee(2, "Monica", "Accountant");
        Manager luis = new Manager(3, "Luis", "Human Resources Manager");
        luis.addEmployee(eric);
        luis.addEmployee(monica);

        Employee mark = new Employee(4, "Mark", "Software Engineer");
        Employee steve = new Employee(5, "Steve", "Security Analyst");
        Manager daniel = new Manager(6, "Daniel", "Project Manager");
        daniel.addEmployee(mark);
        daniel.addEmployee(steve);

        Employee bryan = new Employee(7, "Bryan", "Consultant");
        Employee sofia = new Employee(8, "Sofia", "Marketing Intern");
        Manager liz = new Manager(9, "Liz", "Public Relations Manager");
        liz.addEmployee(bryan);
        liz.addEmployee(sofia);

        Manager elon = new Manager(10, "Elon", "CEO");
        elon.addEmployee(luis);
        elon.addEmployee(daniel);
        elon.addEmployee(liz);

        elon.info();

    }
}