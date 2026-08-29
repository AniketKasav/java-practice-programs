/*Question 14: Write a Java program to rethrow an exception.

Catch exceptions in one method and rethrow it to the calling method.
Asked In Practice Assignment
Input:
Enter number1: 10
Enter number2: 0

Output:
Exception rethrown and handled

Explanation:
Rethrowing allows one method to catch exception, perform cleanup, then pass it to caller for further handling.
 When method catches ArithmeticException and rethrows it, main method catches the
 rethrown exception and displays appropriate message.   */
 
import java.util.*;
public class Ass14{
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
			System.out.println("rethorwed Exception handled in main method "+e.getMessage());
		}
	}
	
	static int result(int num1,int num2) throws ArithmeticException{
		int result=0;
		try{
			result=num1/num2;
		}
		catch(ArithmeticException e){
			System.out.println("here exception rethorw");
			throw e;
		}
		return result;
	}
}
 

