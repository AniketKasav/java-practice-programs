import java.util.Scanner;

public class Ass51 {
//    Q51. Write a Java program to check whether the
//    absolute difference between two numbers is greater than 10.
//    Input:
//    m = 25
//    n = 12
//    Output : Difference is greater than 10
//    Explanation: |25 − 12| = 13.

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first number : ");
        int m=sc.nextInt();
        System.out.print("enter the second number : ");
        int n=sc.nextInt();

        System.out.println(Math.abs(m-n)>10?"Difference is greater than 10":"Difference is not greater than 10");

    }
}
