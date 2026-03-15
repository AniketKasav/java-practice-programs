/*Q21. Given an integer array and a specific element, write a Java program to find the index position of that element in the array. If the element is not found, print -1.
Explanation
Traverse the array from index 0 to length - 1
Compare each element with the target element
If a match is found, return its index
If the loop ends and no match is found, return -1
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30
Output :- Element found at index: 2                         */

import java.util.Scanner;
public class Ass21{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter a element you want to find : ");
		int num=sc.nextInt();
		
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				System.out.printf("Element found at index : %d",i);
				return;
			}
		}
		System.out.print("Element not found = -1");
	}
}