import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
//    Q7. Write a Java program to convert temperature from Fahrenheit to Celsius.
//            Formula: C = (F − 32) × 5 / 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp(in Fahrenheit) :");
        float f = sc.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println("The temp(in   Celsius ):" + c);
    }

}
