//Q22. Write a java program to Check Number Is Perfect Number or Not.
//Example : perfect number, a positive integer that is equal to the sum of its proper divisors. 
//The smallest perfect number is 6,which is the sum of 1, 2, and 3. 
//Other perfect numbers are 28, 496, and 8,128.

import java.util.*;
public class Ass22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a numnber : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		
		if(sum==temp){
			System.out.print("Given number is perfect number !!");
		}else{
			System.out.print("Given number is not perfect number !!");
			
		}
		
		
	}
}