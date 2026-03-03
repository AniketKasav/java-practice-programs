import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args){
//        Q20. Write a Java program to compute the sum of digits of an integer.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= sc.nextInt();
        int sum=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            sum+=digit;
        }
        System.out.println("The sum of digits of an integer :"+sum);
    }

}
