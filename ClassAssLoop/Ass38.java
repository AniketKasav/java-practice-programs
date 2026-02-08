//Q38. Write a java program to find all prime factors of a number.
//Prime factors of a number are the prime numbers (2,3,5,7,11,...) that
//divide that number exactly, without leaving a remainder.

import java.util.*;
public class Ass38{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find all prime factors of a number : ");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num;i++){
			flag=true;
			if(num%i==0){
				//System.out.print(i+" ");
			for(int j=2;j*j<=i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.print(i+" ");
			}
			}
		}
		
		
	}
}