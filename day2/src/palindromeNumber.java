import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args){
//        Q25. Write a Java program to check whether a number is palindrome or not.
//        Explanation : The reversed number is the same as original.

        Scanner sc=new Scanner(System.in );
        System.out.print("Enter the numer :");
        int n=sc.nextInt();
        int num=n;
        int num1=0;
        while(num>0){
            int digit=num%10;
            num1=num1*10+digit;
            num/=10;
        }
//        System.out.printf("num %d and num1 %d",num,num1);
        if(n==num1){
            System.out.println("The given number is palindrome number");
        }else{
            System.out.println("The given number is not palindrome number");

        }


    }

}
