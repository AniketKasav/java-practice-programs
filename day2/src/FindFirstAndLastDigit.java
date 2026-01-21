import java.util.Scanner;

public class FindFirstAndLastDigit {
    public static void main(String[] args){
//        Q22. Write a Java program to find the first and last digit
//        of a three-digit number without using a loop.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number (three digit only) :");
        int num=sc.nextInt();
        int lastDigit=num%10;
        int firstDigit=num/100;
        System.out.println("The first is :"+firstDigit+" and the last digit is :"+lastDigit);

    }
}
