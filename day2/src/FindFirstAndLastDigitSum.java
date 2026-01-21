import java.util.Scanner;

public class FindFirstAndLastDigitSum {
    public static void main(String[] args){
//    Q23. Write a Java program to calculate the sum of the
//    first and last digit without using a loop.(only three digit number)
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (Only three digit ):");
        int num=sc.nextInt();
        int lastDigit=num%10;
        int firstDigit=num/100;
        int sum=lastDigit+firstDigit;
        System.out.printf("The sum of first digit %d and last digit %d is %d",firstDigit,lastDigit,sum);

    }
}
