package classes;

public class Student extends Person{
    String firstName;
    String lastName;
    int groupNumber;
    String fullName;
    int grade;
    public Student(String firstName, String lastName, int groupNumber){
        //EXERCITIU 1 PCT C: Overload the constructors in the Professor, Student, and Course classes, so that there’s a
        //default constructor in each class. The class members will be initialized with empty strings
        //for names, zero for the group, or an empty list for students.
        //AICI ESTE PENTRU STUDENT SI PT NUMARUL GRUPEI
        this.firstName=""; //AM SI IN PERSON
        this.lastName="";
        this.groupNumber=0;
        this.fullName=firstName+lastName;
    }

    public static Boolean remove(Student aux) {
        return null;
    }
    @Override
    public String toString(){
        return "Student{"+"firstName="+firstName+", lastName="+lastName+", groupNumber="+ groupNumber+"}";
    }
    public String getFirstName(){

        return firstName;
    }
    public void setFirstName(String firstName){

        this.firstName=firstName;
    }
    public String getLastName(){

        return lastName;
    }
    public void setLastName(String lastName){

        this.lastName=lastName;
    }
    public int getGroupNumber(){

        return groupNumber;
    }
    public void setGroupNumber(int groupNumber){

        this.groupNumber=groupNumber;
    }
    public int getGrade() {

        return grade;
    }
    public String getFullName(){

        return fullName;
    }

}