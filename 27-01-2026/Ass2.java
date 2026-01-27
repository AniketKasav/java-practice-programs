//Q.2 Write a java Program to display 1 to nth Even numbers.

import java.util.*;

public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to print 1 to n even numbers : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n;i++){
			if(i%2==0){
				count++;
				System.out.println(i);
			}			
		}	
		System.out.printf("Total even number between %d and %d : %d",1,n,count);
	}
}