//Q7. write a java program to reverse given numbber.

import java.util.*;
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int rnum=0;
		int digit;
		while(n>0){
			digit=n%10;
			n/=10;
			rnum=rnum*10+digit;
			
		}
		System.out.printf("Then reverse number is %d",rnum);
	}
}