/*Q23. Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Example :- The given array is: 4 8 4 6 7 4 4 8
       There are no Majority Elements in the given array
Explanation
1.Traverse the array using two loops.
2.For each element, count how many times it appears.
3.If the count of any element is greater than n/2, that element is the majority element.
4.If no such element is found after checking all elements, print that there is no majority element.       */

import java.util.Scanner;
public class Ass23{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int freq;
		for(int i=0;i<a.length;i++){
			freq=0;
			for(int j=0;j<a.length;j++){
				if(a[i]==a[j]) freq++;
				if(freq>a.length/2){
					System.out.print("The majority element : "+a[i]);
					return;
				}
			}
		}
		System.out.print("There are no Majority Elements in the given array");
		
	}
}