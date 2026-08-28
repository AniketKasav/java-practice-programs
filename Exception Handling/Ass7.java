/*Question 7: Write a Java program to handle InputMismatchException.

Accept integer input from the user. If the user enters a character instead of an integer, handle exceptions.
Asked In Practice Assignment
Input:
Enter number: A

Output:
Invalid input type

Explanation:
InputMismatchException is thrown by Scanner when input does not match expected data type.
When user enters character "A" for integer input, exception is thrown.
Catch this exception and display message about correct input format required.  */

import java.util.*; 
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		try{
		 int n=sc.nextInt();
		 System.out.println("given number is "+n);
		}
		catch(InputMismatchException ex){
			System.out.println("Only integer allowed");
		}
			
		
	}
}