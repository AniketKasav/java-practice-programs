//Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.Scanner;

public class Ass20{
	public static void main(String[] args){
		System.out.print("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double root=Math.sqrt(num);
		if(root==(int)root){
			System.out.print("Number is perfect square");
		}else{
			System.out.print("Number is not perfect square");
			
		}
		
	}
}