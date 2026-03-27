/*Q1. Write a java program to check number is neon number or not. 
Example : A neon number is a number where the sum of digits of the square of the number is 
equal to the number.  */

import java.util.Scanner;
public class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check number is neon number or not : ");
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr>0){
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		
		if(sum==num){
			System.out.println("The given number is neon number ");
		}else{
			System.out.println("The given number is not neon number ");
			
		}
		
	}
}