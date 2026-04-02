/*Q8. Write a Java program that uses a void function to calculate power of a number using a loop.
Explanation
Pass base and exponent to the function
Multiply base repeatedly using a loop
Print the final result inside the function      */

import java.util.Scanner;
public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Entee the base value : ");
		int b=sc.nextInt();
		System.out.print("Entee the exponent value : ");
		int p=sc.nextInt();
		power(b,p);
	}
	
	public static void power(int n,int p){
		int result=1;
		for(int i=1;i<=p;i++){
			result*=n;
		}
		System.out.print("Result : "+result);
	}
}