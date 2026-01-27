//Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
//Example
//Input a: 8 ,  b: -4 , c: -2
//Output Root1: 0.80
//Root2: -0.30

//x=(-b+-root(b^2-4ac))/(2a)
//ax2+bx+c=0

//Discriminant:
//d = b*b - 4*a*c
//d > 0 → two real & different roots
//d == 0 → two real & equal roots
//d < 0 → no real roots

import java.util.Scanner;

public class Ass28{
	public static void main(String[] args){
		System.out.println("Enter the value a,b,c ");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float d=b*b-(4*a*c);
		if(d>0){
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.printf("Root=%.2f, Root2=%.2f.",x1,x2);
		}else if(d==0){
			double x=-b/(2*a); //d=0
			System.out.print("Root="+x);
		}else{
			System.out.print("No real root ");
		}
		
	}
}