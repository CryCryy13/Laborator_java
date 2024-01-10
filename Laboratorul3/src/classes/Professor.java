package classes;
//EXERCITIUL 1 A
public class Professor extends Person{
    String firstName;
    String lastName;
    @Override
    public String toString() {

        return "Professor{" + "firstName=" + firstName + ", lastName" + lastName + "}";
    }

    public Professor(String firstName, String lastName){
        // EXERCITIU 1 PCT. C: Overload the constructors in the Professor, Student, and Course classes, so that there’s a
        //default constructor in each class. The class members will be initialized with empty strings
        //for names, zero for the group, or an empty list for students.
        // AICI ESTE PENTRU PROFESOR
        this.firstName="";
        this.lastName="";
    }
    public String getFullName(){

        return firstName+lastName;
    }
}
