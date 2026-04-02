/*Q4. Write a function that accepts two integers and prints the greater number.
Explanation
Compare both numbers using if-else
Print the greater number
Function does not return anything
Example
Input: 15, 25
Output: Maximum number is 25      */

import java.util.Scanner;
public class Ass4{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.print("Enter the Second number : ");
		int num2=sc.nextInt();
		int result=greater(num1,num2);
		System.out.print("Greater number is : "+result);
	}
	
	public static int greater(int n,int m){
		return (n>m)?n:m;
	}
}