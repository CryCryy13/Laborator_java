package classes;
import java.sql.Connection;
import java.util.Scanner; //pentru exercitiul 2 din laborator
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager {
    Course[] courses;
    public CourseManager(){
        Connection conn=null;
        courses=new Course[0];
    }
    public void addCourse(Course course){
        int newLength = courses.length +1;
        Course[] aux=new Course[newLength];
        int index=0;
        for(Course c: courses){
            aux[index++]=c;
        }
        aux[index]=course;
        this.courses= new Course[newLength];
        System.arraycopy(aux,0,courses,0, newLength);
    }
    public void displayCoursesToConsole(){
        for(Course c: courses){
            System.out.println(c);
        }
    }
    //EXERCITIUL 2 ADD A METHOD TO ManagerCursuri THAT ALLOWS YOU TO ENROLL A STUDENT INTO A COURSE BY SPECIFYNG THE COURSE NAME AND THE STUDENT OBJECT
    public String enroll(){
        System.out.println("Specify the course name");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        System.out.println("Specify the first name ");
        String firstName= in.nextLine();
        System.out.println("Specify the last name ");
        String lastName= in.nextLine();
        return "Name: "+firstName+" "+ lastName +"\n Course: "+course;
    }
    //EXERCITIUL 3 EXTEND ManagerCursuri with a method listStudentInCourse(String courseName) that returns a list of all students enrolled in a given course
   // public String listStudentsInCourse(String courseName){
        //for(....)
        //if(...)

    //}
}
