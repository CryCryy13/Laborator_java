import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un cuvant: ");
        String string=sc.nextLine();
        System.out.println("Length is: "+string.length()+"\n Uppercase: "+ string.toUpperCase());
        String search="Java";
        if(string.toLowerCase().indexOf(search.toLowerCase())!= -1){
            System.out.print("Java");
        } else {
            System.out.println("No");
        }

    }
}