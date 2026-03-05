/*Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).  */

import java.util.Scanner;
public class Ass11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements ");
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int largest=a[0],secondLargest=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>largest){
				secondLargest=largest;
				largest=a[i];
			}
		}
		
		System.out.print("Second largest = "+secondLargest);
	}
}
