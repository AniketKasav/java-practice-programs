import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args){
//        Q11. Write a Java program to enter marks of five subjects and calculate total marks and percentage.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of sub1 :");
        int a= sc.nextInt();
        System.out.print("Enter the mark of sub2 :");
        int b= sc.nextInt();
        System.out.print("Enter the mark of sub3 :");
        int c= sc.nextInt();
        System.out.print("Enter the mark of sub4 :");
        int d= sc.nextInt();
        System.out.print("Enter the mark of sub5 :");
        int e= sc.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total :"+total);
        float avg=total/5F;
        System.out.println("Percentage :"+avg);
    }

}
