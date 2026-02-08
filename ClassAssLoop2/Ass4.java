//Q4. WAP to input number and reverse it using a for loop?

import java.util.*;
public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int rem,rnum=0;
		for(;num>0;num/=10){
			rem=num%10;
			rnum=rnum*10+rem;
		}
		System.out.print("Reverse Number : "+rnum);
		
	}
}

