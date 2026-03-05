/*Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.   */

import java.util.Scanner;
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements in array ");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Print array elements !!");
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+"\t");
		}
	}
}

