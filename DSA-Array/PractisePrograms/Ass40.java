/*Q40. Write a Java program to sort a given array in ascending & descending order.
	Input : 	Array = [12, 5, 9, 34, 1]  5 9 12 34 1   
	Output : 	Ascending Order: [1, 5, 9, 12, 34]
Descending Order: [34, 12, 9, 5, 1]
Explanation:
Sorting means arranging elements in a particular order.
In ascending order, numbers are arranged from smallest to largest.
For example: 1 < 5 < 9 < 12 < 34.
In descending order, numbers are arranged from largest to smallest.
For example: 34 > 12 > 9 > 5 > 1.
The program should first sort the array in ascending order, then print the reverse of that order for descending.   */

import java.util.Scanner;
public class Ass40{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		
		//selection sort logic is used
		int min;
		for(int i=0;i<n-1;i++){
			min=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[min]){
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		System.out.println("Ascending Order: ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Descending Order: ");
		for(int i=n-1;i>=0;i--){
			System.out.print(a[i]+" ");
		}
		
	}
}