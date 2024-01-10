package classes;
public class Professor{
    String firstName;
    String lastName;
    @Override
    public String toString() {
        return "Professor{" + "firstName=" + firstName + ", lastName" + lastName + "}";
    }
    public Professor(String firstName, String lastName){
        this.firstName="";
        this.lastName="";
    }
    //EXERCITIUL 1 : Adaug o metoda getFullName() care sa imi returneze numele complet in format "FirstName LastName"
    public String getFullName(){
        return firstName+lastName;
    }
}
