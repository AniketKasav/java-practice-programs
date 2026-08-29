/*Question 11: Write a Java program to create a custom exception for invalid marks.

Accept student marks. If marks are greater than 100 or less than 0, throw user defined exceptions.
Asked In Practice Assignment
Input:
Enter marks: 120

Output:
Invalid Marks Exception

Explanation:
Custom exceptions extend Exception and are created for domain-specific errors.
 When marks (120) exceed valid range (0-100), custom exception is thrown for InvalidMarks. 
 This provides meaningful error information specific to marks validation. 
 Implementing custom exceptions allows developers to define application-specific
 error types for better error handling and clearer code intent.   */
 
import java.util.*;

class InvalidMarksException extends Exception{
	InvalidMarksException(String message){
		super(message);
	}
}


public class Ass11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter marks :");
			int marks=sc.nextInt();
			if(marks<0 || marks>100)throw new InvalidMarksException("Invalid Marks Exception(marks must be between 0 - 100)");
		}
		catch(InvalidMarksException e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
			System.out.println("This is finally block ");
		}
		System.out.println("Program executed successfully");
		
		
	}
}