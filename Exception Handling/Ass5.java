/*Question 5: Write a Java program to demonstrate multiple catch blocks.

Accept two numbers and perform division and also store the result in an array.
Handle both ArithmeticException and ArrayIndexOutOfBoundsException separately.
Asked In Practice Assignment
Input:
Enter number1: 20
Enter number2: 0

Output:
Arithmetic Exception handled

Explanation:
Multiple catch blocks allow handling different exception types differently.
First catch block handles ArithmeticException for division by zero. Second catch block handles
ArrayIndexOutOfBoundsException for invalid array access. Each block provides specific
error handling for its exception type. */

import java.util.Scanner; 
public class Ass5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[2];
		System.out.println("enter two number");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		try{
			int result=arr[0]/arr[1];
			System.out.println("The result :"+result);
			arr[3]=result;
		}
		catch(ArithmeticException ex){
			System.out.println("Arithmetic Exception handled(cannot divide by zero)");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndexOutOfBounds Exception handled Array size is 2 there is no space to store the result");
		}
	}
}