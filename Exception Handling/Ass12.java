/*Question 12: Write a Java program to use the throw keyword.

Accept a number from the user. If the number is negative, throw ArithmeticException manually.
Asked In Practice Assignment
Input:
Enter number: -10

Output:
Negative number not allowed

Explanation:
Throw keyword manually throws an exception when certain conditions are not met. 
When user enters negative number (-10), throw statement explicitly throws ArithmeticException. 
This allows explicit error handling for invalid conditions detected by application.*/

import java.util.*;
public class Ass12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter a number ");
			int num=sc.nextInt();
			if(num<0)throw new ArithmeticException("Negative number not allowed");
			System.out.println("Give number : "+num);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
			System.out.println("This is finally block ");
		}
		System.out.println("Program executed successfully");
		
		
	}
}
