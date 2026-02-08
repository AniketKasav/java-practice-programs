//Q30.  Write a java program to display 1 to nth Perfect Number.
//A perfect number is a positive integer that equals the sum of its proper positive divisors 
//(all divisors excluding the number itself), such as 6 (1+2+3=6) and 28 (1+2+4+7+14=28).

import java.util.*;
public class Ass30{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum;
		System.out.printf("Perfect numbers 1 to %d =",num);
		for(int n=1;n<=num;n++){
			sum=0;
			for(int i=1;i<=n/2;i++){
				if(n%i==0){
				sum+=i;
				}
			}
			if(sum==n){
				System.out.print(" "+n);
			}
		}
		
		
	}
}
