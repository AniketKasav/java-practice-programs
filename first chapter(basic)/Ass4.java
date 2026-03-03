import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args){
//        Q4. Write a Java program to enter length and breadth of a rectangle and calculate its area.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length :");
        int l=sc.nextInt();
        System.out.print("Enter the Breadth  :");
        int b=sc.nextInt();
        int a=l*b;
        System.out.println("Area ="+a);
    }
}
