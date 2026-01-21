import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args){
//        Q3. Write a Java program to enter two numbers and perform
//        addition, subtraction, multiplication, division, and modulus.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a=sc.nextInt();
        System.out.print("Enter the second number :");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Addition :"+sum);
        int sub=a-b;
        System.out.println("Subtraction  :"+sub);
        int mul=a*b;
        System.out.println("Multiplication  :"+mul);
        int div=a/b;
        System.out.println("Division  :"+div);
        int mod=a%b;
        System.out.println("Modulus  :"+mod);
    }
}
