/*Question 16: Write a Java program to handle multiple exceptions in a single catch.

Use Java multi catch feature to handle ArithmeticException and NumberFormatException.
Asked In Practice Assignment
Input:
Enter number: XYZ

Output:
Exception handled using multi catch

Explanation:
Multi-catch feature (Java 7+) allows catching multiple exception types in single catch block using pipe (|) operator.
 Single catch block handles both ArithmeticException and NumberFormatException. 
 This reduces code duplication when same handling logic applies to multiple exceptions.  */
 
import java.util.*;

public class Ass16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter two number to perform division ");
			System.out.print("Num1 : ");
			int num1=sc.nextInt();
			System.out.print("Num2 : ");
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("Division result :"+result);
			
			System.out.println("Enter a number to display it(number is string format)");
			sc.nextLine();
			String str=sc.nextLine();
			int n=Integer.parseInt(str);
			System.out.println("Number is :"+n);
		}
		catch(ArithmeticException | NumberFormatException | InputMismatchException e){
			System.out.println("Exception handled using multi catch -> "+e.getMessage());
		}
		
	}
}