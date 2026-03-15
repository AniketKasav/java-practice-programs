/*Q34. Return the first element that repeats in the array.
Input: {10, 5, 3, 4, 3, 5, 6}
Output: First repeating element is 5
Explanation:
Traverse from left:
10 → first time.
5 → first time.
3 → first time.
4 → first time.
3 → already seen earlier → repeating, but not the first repeating (we must check carefully).
5 → this was the earliest element that repeats.
Therefore, the first repeating element is 5.               */

import java.util.Scanner;
public class Ass34{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Check whether the given array is a palindrome.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int count;
		for(int i=0;i<n;i++){
			count=0;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					System.out.print("First repeating element is "+a[i]);
					return;
				}
			}
		}
		System.out.print("There is no repeating element");
		}
		
}

