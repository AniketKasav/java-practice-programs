/*Q3. Create a recursive function that returns the sum of first N natural numbers.
Explanation:
Add current number with the sum of previous numbers.
Base condition: when N becomes 0, return 0.               */

import java.util.Scanner;
public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int result=Sum(n);
		System.out.printf("Sum from 1 to %d : %d",n,result);
	}
	
	public static int Sum(int n){
		if(n==0){
			return 0;
		}
		return n+Sum(n-1);
	}
	
}