//Q.4 Write a java Program to take 2 integer from user start and end and find the sum of even number between start and end.

import java.util.*;
public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integer to find the sum of even number between start and end (including start and end):");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum =0;
		
		for(int i=a;i<=b;i++){
			if(i%2==0){
				//System.out.println(i);
			sum+=i;
			}
		}
		System.out.printf("Sum of even number btw %d and %d : %d",a,b,sum);
		
	}
}