package main.java.com.behavioral.iterator;


public class Client {

    public static void main(String[] args) {
        Course[] courses = {new Course("CS50", 103), new Course("MATH103", 340), new Course("PHYS98", 8)};
        StudentCourse studentCourse = new StudentCourse("Elon", courses);

        Iterator iterator = studentCourse.iterator();

        System.out.println("Student Name: " + studentCourse.getName() + "\n");
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            System.out.println("Course Name: "+course.getName() + "\n" + "Section Name: " + course.getSection() + "\n");
        }
    }
    
}
