/*Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.    */

import java.util.Scanner;
public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter 6 elements of array ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Values at even index = ");
		for(int i=0;i<a.length;i+=2){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nValues at odd index = ");
		for(int i=1;i<a.length;i+=2){
			System.out.print(a[i]+" ");
		}
	}
}
