//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class Ass13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int digit=0;
		int rnum=0;
		while(num>0){
			digit=num%10;
			num/=10;
			rnum=rnum*10+digit;
		}
		System.out.print("Reverse number : "+rnum);
	}
}
