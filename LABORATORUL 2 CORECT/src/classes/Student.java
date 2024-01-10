package classes;
public class Student{
    String firstName;
    String lastName;
    int groupNumber;
    String fullName;
    int grade;
    public Student(String firstName, String lastName, int groupNumber){
        this.firstName="";
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
    //EXERCITIUL 1 : Adaug o metoda getFullName() care sa imi returneze numele complet in format "FirstName LastName"
    public String getFullName(){

        return fullName;
    }

}

