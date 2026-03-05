/*Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.    */

import java.util.Scanner;
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		System.out.print("Enter the size of array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Array before reverse : ");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		//reverse logic
		
		for(i=0;i<n;i++){
			int temp=a[0];
			for(j=0;j<n-1-i;j++){  
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
		System.out.print("\nArray after reverse : ");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
