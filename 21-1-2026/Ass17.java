//Q17. Write a java program to find the maximum between two numbers.

import java.util.Scanner;

public class Ass17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print(a>b?"Max : "+a:"Max : "+b);
	}
}