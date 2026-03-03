//Q35. Write a java program to enter a number and print it in words.

import java.util.*;
public class Ass35{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int rem,rnum=0;
		while(num>0){
			rem=num%10;
			//rnum=rnum*10+rem;
			
			
			
			num/=10;
		}
		
	}
}