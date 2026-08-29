/*Question 13: Write a Java program to use throws keyword.

Create a method that performs division and declares exceptions using throws keyword. Handle it in the main method.
Asked In Practice Assignment
Input:
Enter number1: 25
Enter number2: 0

Output:
Exception handled in main method

Explanation:
Throws keyword in method signature declares that method may throw exceptions. 
When called method throws exception due to division by zero, calling method (main) catches and handles it. 
This defers exception handling to calling method.  */

import java.util.*;
public class Ass13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter two number for the division");
			System.out.println("num1 :");
			int num1=sc.nextInt();
			System.out.println("num2 :");
			int num2=sc.nextInt();
			System.out.println("Result :"+result(num1,num2));
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled in main method "+e.getMessage());
		}
	}
	
	static int result(int num1,int num2) throws ArithmeticException{
		return num1/num2;
	}
}