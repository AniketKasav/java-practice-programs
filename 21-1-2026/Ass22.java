//Q22. Write a java program to check whether a number is palindrome or not. 

import java.util.Scanner;

public class Ass22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int num1=num;
		int rnum=0;
		while(num1>0){
			int digit=num1%10;
			rnum=rnum*10+digit;
			num1=num1/10;
		}
		if(rnum==num){
			System.out.print("the given number is palindrome");
		}else{
			System.out.print("the given number is not palindrome");
			
		}
		
	}
}