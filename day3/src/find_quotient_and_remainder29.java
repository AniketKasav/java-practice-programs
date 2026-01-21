import java.util.Scanner;

public class find_quotient_and_remainder29 {
    public static void main(String[] args){
//        Q29.Write a Java program to find quotient and remainder using arithmetic operators.
//        Input	:  Dividend = 20	Divisor = 3
//        Output   :  Quotient = 6	Remainder = 2
//        Explanation	:  Division and modulus are used.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Dividend :");
        int Dividend=sc.nextInt();
        System.out.print("Enter the Divisor :");
        int Divisor=sc.nextInt();

        int Quotient=Dividend/Divisor;
        System.out.println("Quotient :"+Quotient);
        int Remainder=Dividend%Divisor;
        System.out.println("Quotient :"+Remainder);




    }
}
