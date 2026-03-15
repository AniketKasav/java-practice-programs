/*Q38. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). 
For each element, find the sum of divisors and compare with the number, then count.                  */

import java.util.Scanner;
public class Ass38{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Count the number of Perfect numbers in an array.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements  : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		int count=0,sum;
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=1;j<=a[i]/2;j++){
				if(a[i]%j==0){
					sum+=j;
				}
			}

			if(sum==a[i]){
				count++;
			}
		}
		
		System.out.print("Count of Perfect numbers ="+count);
		
	}
}