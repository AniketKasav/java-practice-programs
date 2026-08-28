/*Question 6: Write a Java program to demonstrate finally block execution.

Perform division of two numbers and display result. Whether an exception occurs or not, the finally block must execute.
Asked In Practice Assignment
Input:
Enter number1: 15
Enter number2: 3

Output:
Result is: 5
Finally block executed

Explanation:
Finally block always executes regardless of whether exception occurred or not.
 It is used for cleanup operations like closing files or connections. 
 In this case, finally block executes after division is performed and result is displayed.   */
 
import java.util.Scanner; 
public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integer");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try{
			int result=a/b;
			System.out.println("Result is "+result);
		}
		catch(Exception e){
			System.out.println("exception occurred cannot devide by zero");
		}
		finally{
			sc.close();
			System.out.println("Finally block executed");
		}
	}
}