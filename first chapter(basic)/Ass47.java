import java.util.Scanner;

public class MaxNumber {
//    Q47. Write a Java program to find the maximum between two numbers.
//            Input:
//    A = 14
//    B = 9
//    Output : Maximum = 14
//    Explanation : 14 is greater than 9.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();

        System.out.println(a>b?"Maximum = "+a:"Maximum = "+b);


    }




}
