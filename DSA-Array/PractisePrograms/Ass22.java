/*Q22. Write a Java program to check whether two integer arrays are equal.
 Two arrays are considered equal if:
Both arrays have the same length
Corresponding elements at each index are exactly the same
Do not use inbuilt methods like Arrays.equals().
Input :- Array1 = {10, 20, 30, 40}
            Array2 = {10, 20, 30, 40}
Output :- Arrays are equal.           */

import java.util.Scanner;
public class Ass22{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array1 size : ");
		int n1=sc.nextInt();
		System.out.println("Enter array1 elements : ");
		int []a=new int[n1];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}System.out.print("Enter the array2 size : ");
		int n2=sc.nextInt();
		System.out.println("Enter array2 elements : ");
		int []b=new int[n2];
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		
		if(a.length!=b.length){
			System.out.print("Arrays are not equal !!");
			return;
		}
		
		for(int i=0;i<a.length;i++){
			if(a[i]!=b[i]){
				System.out.print("Arrays are not equal !!");
				return;
			}
		}
		System.out.print("Arrays are equal !!");
		
	}
}