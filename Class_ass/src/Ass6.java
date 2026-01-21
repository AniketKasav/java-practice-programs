import java.util.Scanner;

public class Ass6 {
    public static void main(String[]args){
//        Q6. Write a Java program to convert length from centimeter into meter and kilometer.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length(in cm) :");
        int l= sc.nextInt();
        float m=l/100F;
        float km=l/100000F;
        System.out.println("Meter ="+m);
        System.out.println("Kilometer ="+km);
    }
}
