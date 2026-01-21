import java.util.Scanner;

public class Ass43 {
//    Q43. Write a Java program to accept two integers and check whether they are equal.
//    Input:
//    A = 50
//    B = 50
//    Output : Equal
//    Explanation : Both numbers have the same value.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2=sc.nextInt();
        // using unary operator   ?  :
        System.out.println(num1 == num2?"equal":"not equal");

    }


}
