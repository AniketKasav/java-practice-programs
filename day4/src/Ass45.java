import java.util.Scanner;

public class Ass45 {
//    Q45. Write a Java program to find the minimum between two numbers.
//            Input:
//    A = 8
//    B = 12
//    Output : Minimum = 8
//    Explanation : 8 is smaller than 12.

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the first number : ");
        int num2=sc.nextInt();
        System.out.println(num1>num2?"Maximum = "+num1:"Maximum = "+num2);

    }
}
