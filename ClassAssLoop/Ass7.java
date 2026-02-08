//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;

public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num=sc.nextInt();
			int sum=0;
			for(int i=2;i<=num;i++){
				if(i%2==0){
				sum+=i;
				}
			}
			System.out.printf("Sum of even number form 1 to %d : %d ",num,sum);	
			
		
	}
}