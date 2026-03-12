/*Q20. Write a Java program to print all elements from an integer array that are greater than a given number.
Explanation
An integer array is given.
A number N is also given.
Traverse the array using a loop.
Compare each element with N.
If the element is greater than N, print it.
Input :- Array: 10 25 5 40 18
 Given Number: 20
Output :- Elements greater than 20 : 25 40                                       */

import java.util.Scanner;
public class Ass20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Java program to print all elements from an integer array that are greater than a given number.");
		System.out.print("Enter the size of an array : ");
		int n=sc.nextInt();
		System.out.println("Enter an array elements ");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		
		System.out.printf("Elements greater than %d :",num);
		for(int i=0;i<a.length;i++){
			if(a[i]>num){
				System.out.print(a[i]+" ");
			}
		}
		
	}
}