/*Question 10: Write a Java program to demonstrate nested try blocks.

Create nested try blocks where the inner block handles ArithmeticException and 
outer handles ArrayIndexOutOfBoundsException.
Asked In Practice Assignment
Input:
Enter number: 10
Enter divisor: 0

Output:
Inner exception handled

Explanation:
Nested try blocks allow handling different exceptions at different levels. 
Inner try block catches ArithmeticException when divisor is zero. 
Outer try block can catch ArrayIndexOutOfBoundsException if it occurs. 
This hierarchical exception handling provides fine-grained control.           */

import java.util.*;

public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		try{
			int[] arr=new int[3];
			System.out.println("Enter two number for division");
			System.out.print("num1 :");
			int num1=sc.nextInt();
			System.out.print("num2 :");
			int num2=sc.nextInt();
			arr[0]=num1;
			arr[1]=num2;
			int result=0;
			try{
				result=num1/num2;
				System.out.println("Division result :"+result);
			}
			catch(ArithmeticException e){
				System.out.println("Inner exception handled");
			}
			System.out.println("Enter the array index to store the result(idx 0 -> num1 and idx 1->num2)");
			int idx=sc.nextInt();
			arr[idx]=result;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Outer exception handled");
		}
		
		finally{
			sc.close();
			System.out.println("This is finally block ");
		}
		System.out.println("Program executed successfully");
		
		
	}
}