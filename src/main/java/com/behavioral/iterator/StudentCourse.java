package main.java.com.behavioral.iterator;

public class StudentCourse implements Collection {
    
    private String name;
    private Course[] courses;

    public StudentCourse(String name, Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Course[] getCourses() {
        return courses;
    }

    @Override
    public Iterator iterator() {
        return new CourseIterator();
    }

    private class CourseIterator implements Iterator {

        private int index;
        
        @Override
        public Object next() {
            if(this.hasNext()) {
                return courses[index++];
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            if (index < courses.length) {
                return true;
            }
            return false;
        }

    }

}
