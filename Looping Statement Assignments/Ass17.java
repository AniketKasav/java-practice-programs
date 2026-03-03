//Q17. Write a java program to find all factors of a number.

import java.util.*;
public class Ass17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		System.out.print("Factors : ");
		int i=1;
		while(i<=num){
			if(num%i==0){
				System.out.print(i+" ");
			}
			i++;
		}
		
	}
}

