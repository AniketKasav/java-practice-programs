/*Question 8: Write a Java program to demonstrate try-catch without exception.

Write code inside a try block which does not generate exceptions and show program flow.
Asked In Practice Assignment
Input:
Enter number: 5

Output:
Number is: 5
Program executed successfully

Explanation:
Try block executes successfully when no exception occurs. The code runs normally and completes execution.
 This demonstrates that try-catch is not only for error conditions but also validates code execution flow. 
 Finally block executes after successful try block completion.  */
 
import java.util.*;
public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("enter a number ");
			int num=sc.nextInt();
			System.out.println("Give number : "+num);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
			System.out.println("This is finally block ");
		}
		System.out.println("Program executed successfully");
		
		
	}
}
