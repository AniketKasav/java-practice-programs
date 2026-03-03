import java.util.Scanner;
import java.util.*;

public class Ass10 {
    public static void main(String[]args){
//        Q10. Write a Java program to calculate the area of an equilateral triangle.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side:");
        int l= sc.nextInt();
        double a=(Math.sqrt(3)/4)*l*l;
        System.out.printf("The area is :%.2f%n",a);


    }
}
