//Q6. Write java program to count number of digit in given number.

import java.util.*;

public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int count=0;
		while(n>0){
			n/=10;
			count++;		
		}
		
		System.out.print("Number of digit : "+count);
		
	}
} 