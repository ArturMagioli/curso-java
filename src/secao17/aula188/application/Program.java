package secao17.aula188.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import secao17.aula188.entities.Course;
import secao17.aula188.entities.Instructor;
import secao17.aula188.entities.Student;

public class Program {
    
    public static void main(String[] args) {
    
        Instructor alex = new Instructor("Alex");
        Course a =  new Course("Curso A", alex);
        Course b = new Course("Course B", alex);
        Course c = new Course("Curso C", alex);

        alex.addCourse(a);
        alex.addCourse(b);
        alex.addCourse(c);

        Scanner sc = new Scanner(System.in);

        addStudents(a, sc);
        addStudents(b, sc);
        addStudents(c, sc);


        System.out.println("Total students: " + getTotalStudents(alex));
        sc.close();
    }

    private static void addStudents(Course course, Scanner sc) {

        System.out.print("How many students for " + course.getName() + ": ");
        int qtdStudents = sc.nextInt();
        
        for (int i = 0; i < qtdStudents; i++) {
            course.addStudent(new Student(sc.nextInt()));
        }
    }

    private static int getTotalStudents(Instructor instructor) {

        Set<Student> students = new HashSet<>();
        for(Course c : instructor.getCourses()) {
            students.addAll(c.getStudents());
        }

        return students.size();
    }
}
