/*Q1.Write a function that accepts two integers and prints their sum.
Explanation
Function takes two numbers as parameters
Calculates sum inside the function
Prints the result using System.out.println()
Example
Input: 10, 20              Output: Sum = 30      */


import java.util.Scanner;
public class Ass1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.print("Enter the Second number : ");
		int num2=sc.nextInt();
		sum(num1,num2);
	}
	
	public static void sum(int n,int m){
		int result= m+n;
		System.out.println("Sum : "+result);
	}
}