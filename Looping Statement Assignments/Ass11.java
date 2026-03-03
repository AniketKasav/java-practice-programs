//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;
public class Ass11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int digit=0;
		int sum=0;
		while(num>0){
			digit=num%10;
			num/=10;
			sum+=digit;
		}
		System.out.print("the sum of digits in a number : "+sum);
	}
}