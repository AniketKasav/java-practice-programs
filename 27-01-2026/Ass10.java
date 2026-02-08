//Q10. WAP to input number and check number is perfect or not?
//A perfect number is a positive integer that equals the sum of its proper positive divisors (excluding the number itself).
//The smallest perfect number is 6 (\(1+2+3=6\)), followed by 28 (\(1+2+4+7+14=28\)), 496, and 8.

import java.util.*;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<num){
			if(num%i==0){
				sum+=i;
			}
			i++;
		}
		if(sum==num){
			System.out.println("Given number is perfect number !!");
		}else{
			System.out.println("Given number is not perfect number !!");
		}
	}
}