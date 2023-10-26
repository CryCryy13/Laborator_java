//BASIC CALCULATOR
import java.util.Scanner;

public class exercitiul1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number is: ");
        float a=sc.nextFloat();
        System.out.println("The second number is: ");
        float b= sc.nextFloat();
        float sum=a+b;
        float dif=a-b;
        float subs=a*b;
        float div=a/b;
        float rest=a%b;
        System.out.println("The sum is: "+sum+"\n The difference is: "+dif+"\n Division: "+div+"\nInmultire: "+subs+"\n Modulo: "+rest);

    }
}
