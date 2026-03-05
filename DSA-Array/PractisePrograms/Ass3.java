/*
Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.                    */

import java.util.Scanner;
public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter 6 element of array");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Even Values = ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.print("\nOdd Values = ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(a[i]+" ");
			}
		}
	}
}
