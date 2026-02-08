//Q6. Write a java program to find the sum of all natural numbers between 1 to n.

import java.util.*;

public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num=sc.nextInt();
			int sum=0;
			for(int i=1;i<=num;i++){
				sum+=i;
			}
			System.out.printf("Sum of number form 1 to %d : %d ",num,sum);	
			
		
	}
}