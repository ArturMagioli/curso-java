package secao17.aula188.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    
    private String name;

    private Instructor Instructor;
    private Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, Instructor instructor) {
        this.name = name;
        Instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return Instructor;
    }

    public void setInstructor(Instructor instructor) {
        Instructor = instructor;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
