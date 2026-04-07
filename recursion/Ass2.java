/*Q2 Write a recursive function to calculate the factorial of a given number.
Explanation:
Factorial of n is n * factorial(n-1).
Base condition: factorial of 0 or 1 is 1.                  */

import java.util.Scanner;
public class Ass2{
	static int num=1;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.print("factorial : "+result);
	}
	
	public static int factorial(int n){
		if(n<=1){
			return 1;
		}
		return n*factorial(n-1);
	}
	
}