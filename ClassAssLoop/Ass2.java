//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;

public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int i=num;
		while(i>0){
			System.out.println(i);
			i--;
		}	
	}
}