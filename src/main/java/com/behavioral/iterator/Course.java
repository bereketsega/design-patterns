package main.java.com.behavioral.iterator;

public class Course {
    
    private String name;
    private int section;

    public Course(String name, int section) {
        this.name = name;
        this.section = section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public int getSection() {
        return section;
    }

}
