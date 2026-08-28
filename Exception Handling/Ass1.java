/*Question 1: Write a Java program to handle ArithmeticException when a number is divided by zero.

Accept two integer numbers from the user and perform division. If the denominator is zero, 
handle the exception and display a proper message instead of terminating the program.
Asked In Practice Assignment
Input:
Enter first number: 10
Enter second number: 0

Output:
Exception occurred: Cannot divide by zero

Explanation:
ArithmeticException is thrown when dividing by zero. Use try-catch block to catch this exception. 
In the catch block, display an error message explaining that division by zero is not allowed.
 This prevents the program from crashing and allows graceful error handling.   */


import java.util.Scanner; 
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to perform the division of two integer");
		System.out.print("Enter value of a :");
		int a=sc.nextInt();
		System.out.print("Enter value of b :");
		int b=sc.nextInt();
		
		try{
			int result=a/b;
			System.out.println("Deveision result :"+result);
		}catch(ArithmeticException ex){
			System.out.println("division by zero is not allowed."+ex.getMessage());
		}
		System.out.println("This statement after the catch block");
	}
}