//Odd or Even number
import java.util.Scanner;

public class exercitiul4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        float a=sc.nextFloat();
        if(a%2==0){
            System.out.println("EVEN NUMBER " + a);
        }
        if(a%2==1){
            System.out.println("ODD NUMBER " + a);
        }
    }
}
