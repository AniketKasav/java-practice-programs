/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. 
If it matches, print "found" with index; otherwise print "not found".   */

import java.util.Scanner;
public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the array ");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Enter the element you want to found : ");
		int ele=sc.nextInt();
		
		for(int i=0;i<n;i++){
			if(a[i]==ele){
				System.out.print("Found !!");
				return;
			}
		}
		System.out.print("Not Found !!");
	}
}
