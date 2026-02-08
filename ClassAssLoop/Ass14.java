//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Ass14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int digit=0;
		int rnum=0,n=num;
		while(n>0){
			digit=n%10;
			n/=10;
			rnum=rnum*10+digit;
		}
		if(rnum==num){
		System.out.print("Given number is palindrome !!");
		}else{
		System.out.print("Given number is not palindrome !!");
			
		}
	}
}
