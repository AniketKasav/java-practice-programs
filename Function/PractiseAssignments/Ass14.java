/*Q14. Write a method that takes two integers and returns the greater number.
Explanation
Compare both numbers
Return the larger one
Method Signature - static int findMax(int a, int b)

Input - a = 12, b = 20
Output - Maximum = 20       */

import java.util.Scanner;
public class Ass14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number ");
		int a=sc.nextInt();
		System.out.println("Enter a second number ");
		int b=sc.nextInt();
		
		int result=findMax(a,b);
		System.out.print("Maximum is : "+result);
		
	}
	
	public static int findMax(int a,int b){
		return a>b?a:b;
	}
}