/*Q3. Write a function that accepts an integer N and prints numbers from 1 to N.
Explanation
Function receives value of N
Use a loop inside the function
Print numbers one by one
Example
Input: 5      — 1 2 3 4 5      */

import java.util.Scanner;
public class Ass3{
	static int i=1;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		printSeries(num);
	}
	
	/*public static void printSeries(int n){
		for(int i=1;i<=n;i++){
			System.out.print(i+" ");
		}
	}*/
	
	public static int printSeries(int n){  //using recursion
		if(i<=n){
			System.out.print(i+" ");
			printSeries(n);
		}
	}
	}
}