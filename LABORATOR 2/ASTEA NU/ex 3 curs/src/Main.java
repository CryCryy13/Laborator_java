import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pentru grade Celsius introduceti 1" + "\nPentru grade Fahrenheit introduceti 2");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Introduceti temperatura in grade Fahrenheit: ");
            double b = sc.nextDouble();
            double celsius = (b - 32) * 5 / 9;
            System.out.println("\nTemperatura in grade Celsius este: " + celsius);
        }
        if (a == 2) {
            System.out.println("Introduceti temperatura in grade Celsius: ");
            double c = sc.nextDouble();
            double fahrenheit = c * 1.8 + 32;
            System.out.println("\nTemperatura in grade Fahrenheit este: " + fahrenheit);
        }



}}