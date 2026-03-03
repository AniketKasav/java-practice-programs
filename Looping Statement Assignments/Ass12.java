//Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;
public class Ass12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int digit=0;
		int pro=1;
		while(num>0){
			digit=num%10;
			num/=10;
			pro*=digit;
		}
		System.out.print("the product of digits in a number : "+pro);
	}
}