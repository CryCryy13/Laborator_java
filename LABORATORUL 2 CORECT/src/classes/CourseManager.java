package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CourseManager{
    Course[] courses;
    public CourseManager() {
        Connection conexiune = null;
        courses = new Course[0];
    }
    public void addCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for (Course c : courses) {
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = new Course[newLength];
        System.arraycopy(aux, 0, courses, 0, newLength);
    }
    public void displayCoursesToConsole() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    //EXERCITIUL 2: Trebuie sa adaug o metoda in clasa ManagerCursuri care sa imi permita sa inrolez un student la un curs specificand numele cursului si al studentului
    public void adaugstudentlacurs(String courseName, Student student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                System.out.println("Studentul adaugat la curs este: " + courseName);
                return;
            }
        }
    }

    //EXERCITIUL 3: Extend ManagerCursuri with a method listStudentsInCourse(String
    //courseName) that returns a list of all students enrolled in a given course.
    public List<Student> listStudentsInCourse(String courseName) {
        List<Student> enrolledStudents = new ArrayList<>();

        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                // Adaug toți studenții cursului în listă
                for (Student student : course.students) {
                    enrolledStudents.add(student);
                }
                break;
            }
        }

        return enrolledStudents;
    }

    //EXERCITIUL 4: Create a method in CourseManager that calculates and returns the average grade for a specific
    //course.
    public double calculmedianotelor(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                Student[] students = course.students;
                double sumanote = Arrays.stream(students)
                        .mapToInt(student -> student.getGrade())
                        .sum();
                double medianotelor = sumanote / students.length;

                System.out.println("Media este: " + medianotelor);
            }
        }
        System.out.println("Nu avem medie");
        return 0; //nusj dc crapa fara asta...asa rezolvat inteliJ
    }
    //EXERCITIUL 5: Create a method in CourseManager that calculates and returns the average grade given by a
    //specific professor across all their courses.

    public double calculmediedatadeprof(Professor professor) {
        int totalnote = 0;
        int totalcursuri = 0;
        int medie=0;
        for (Course course : courses) {
            if (course.getTeacher().getFullName().equals(professor.getFullName())) {
                totalnote += Arrays.stream(course.students)
                        .mapToInt(student -> student.getGrade())
                        .sum();
                totalcursuri++;
            }
        }

        if (totalcursuri > 0) {

            medie= totalnote / totalcursuri;
            System.out.println("Media este: " + medie);
        } else {
            System.out.println("Fara medie");
        }

        return 0; //si aici crapa fara asta
    }}





