/*Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value                                     */

import java.util.Scanner;
public class Ass7{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		factors(num);
	}
	
	public static void factors(int num){
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.print(num);
	}
}