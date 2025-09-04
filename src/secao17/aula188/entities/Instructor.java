package secao17.aula188.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {
    
    private String name;

    private Set<Course> courses = new HashSet<>();

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
