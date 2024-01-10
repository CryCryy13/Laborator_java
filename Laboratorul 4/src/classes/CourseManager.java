package classes;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//EX. 3 B: Modify the CourseManager class as follows: public class CourseManager implements
//ManagerCourseOperations.
public class CourseManager implements ManagerCourseOperation{
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
    public void adaugstudentlacurs(String courseName, Student student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                System.out.println("Studentul adaugat la curs este: " + courseName);
                return;
            }
        }
    }
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
    }
    //EXERCITIUL 3 PCT C: Add functional code for the methods:
//– public void UpdateCourse(Course course);
//– public void DeleteCourse(Course course);
    @Override
    public void AddCourse(Course course) {
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

    @Override
    public void UpdateCourse(Course course) {
        int cursdeupdate = courses.length;
        for(int i = 0; i < courses.length; i++){
            if(courses[i].equals(course)){
                cursdeupdate = i;
                break;
            }
        }}

    public void DeleteCourse(Course course) {
        int cursdesters = courses.length;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(course)) {
                cursdesters = i;
                break;
            }
        }
    }}
