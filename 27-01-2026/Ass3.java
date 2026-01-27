//Q.3 Write a java Program to display 1 to nth odd numbers.

import java.util.*;

public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbet to display 1 to n odd numbers : ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			if(i%2!=0){
			System.out.println(i);
			}
			i++;
		}	
	}
}