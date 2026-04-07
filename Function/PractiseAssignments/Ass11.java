/*Q11. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30                     */

import java.util.Scanner;
public class Ass11{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two integer : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=Sum(a,b);
		System.out.println("Result is : "+result);
	}
	
	public static int Sum(int a,int b){
		return a+b;
	}
}