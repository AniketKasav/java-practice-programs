import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args){
//        Q21. Write a Java program to reverse a number without using a loop.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (only three digit number):");
        // 123
        // 321
        int num=sc.nextInt();
        int digit=num%10;
        int num2=0;
        num2=num2*10+digit;
        num/=10;
        digit=num%10;
        num2=num2*10+digit;
        num/=10;
        digit=num%10;
        num2=num2*10+digit;
        System.out.println(num2);


    }
}
