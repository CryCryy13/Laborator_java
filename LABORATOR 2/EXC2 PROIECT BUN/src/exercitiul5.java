//Password Validator
import java.util.Scanner;

public class exercitiul5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti parola: ");
        String pw=sc.nextLine();
        if(pw.length()<8){
            System.out.println("Parola este pres scurta ");
        }
        int lowercase =0;
        int uppercase =0;
        for(int i=0; i<pw.length();i++) {
            char ch = pw.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ++uppercase;
            } else {
                ++lowercase;
            }
        }
        if(lowercase==0){
            System.out.println("Parola trebuie sa contina cel putin o litera mare! ");

        }
        if(uppercase==0){
            System.out.println("Parola trebuie sa contina cel putin o litera mica!");
        }
        if(pw.matches(".*\\d.*")&& lowercase!=0 && uppercase!=0){
            System.out.println("Parola acceptata!");
        } else {
            System.out.println("Parola trebuie sa contina cel putin o cifra de la 0 la 9!");
        }


    }
}
