/*Q6.Write a Java program that uses a void function to check whether a given two-digit number is a special number.
A number is special if: (sum of digits + product of digits) = original number
Explanation
Pass the number to a function
Extract digits using % and /
Calculate sum and product     */

import java.util.Scanner;
public class Ass6{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number (Two digit number ): ");
		int num=sc.nextInt();
		boolean result=specialNumber(num);
		if(result)
			System.out.print("Given number is special");
		else
			System.out.print("Given number is not special");
	}
	
	public static boolean specialNumber(int n){
		int sum=0,product=1;
		int temp=n;
		while(n!=0){
			int digit=n%10;
			sum+=digit;
			product*=digit;
			n/=10;
		}
		return (sum+product)==temp;
	}
}