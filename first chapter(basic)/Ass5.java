import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args){
//        Q5. Write a Java program to enter the radius
//        of a circle and calculate its diameter, area, and circumference
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius :");
        int r=sc.nextInt();
        int d=2*r;
        System.out.println("Diameter ="+d);
        double a=3.14*r*r;
        System.out.println("Area ="+a);
        double c=2*3.14*r;
        System.out.println("Circumference ="+c);

    }
}
