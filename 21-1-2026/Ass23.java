//Q23. Write a java program to Check Number Is Spy Number or Not.
//Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
//	 Input : 1412
//	Output : Spy Number
//	Explanation :
//	sum = (1 + 4 + 1 + 2) = 8
//	product = (1 * 4 * 1 * 2) = 8
//	since, sum == product == 8

import java.util.Scanner;

public class Ass23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		//int num1=num;
		int sum=0,pro=1;
		while(num>0){
			int digit=num%10;
			sum+=digit;
			pro*=digit;
			num/=10;
		}
		if(sum==pro){
			System.out.print("the given number is spy");
		}else{
			System.out.print("the given number is not spy");
			
		}
		
	}
}