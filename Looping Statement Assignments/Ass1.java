//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;

public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int i=1;
		while(i<=num){
			System.out.println(i);
			i++;
		}	
	}
}