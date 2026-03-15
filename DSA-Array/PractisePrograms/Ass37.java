/*Q37. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.   */

import java.util.Scanner;
public class Ass37{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Count the number of prime numbers in an array.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements  : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		int count=0;
		boolean isPrime;
		for(int i=0;i<n;i++){
			isPrime=true;
			if(a[i]<=1){
				continue;
			}
			for(int j=2;j*j<=a[i];j++){
				if(a[i]%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				count++;
			}
		}
		
		System.out.print("Count of prime numbers = "+count);
		
	}
}
