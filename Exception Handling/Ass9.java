/*Question 9: Write a Java program to print custom error messages using catch blocks.

Accept age from users. If age is negative, throw exceptions and print proper messages.
Asked In Practice Assignment
Input:
Enter age: -5

Output:
Invalid age entered

Explanation:
Custom error messages in catch blocks provide clear information about what went wrong. 
When age is negative (-5), validation fails and exception is caught. 
Custom message "Invalid age entered" informs user about the specific problem instead of generic error. */

import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter your age ");
			int age=sc.nextInt();
			if(age<0)throw new InvalidAgeException("Invalid age entered(age must be zero or greater than zero)");
			System.out.println("your age : "+age);
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
			System.out.println("This is finally block ");
		}
		System.out.println("Program executed successfully");
		
		
	}
}
