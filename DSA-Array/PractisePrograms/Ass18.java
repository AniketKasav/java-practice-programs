/*Q18. Write a Java program to check whether a given array is empty or not.
Explanation
Every array has a predefined property called length.
If array.length == 0, then the array is empty.
Otherwise, the array contains elements.
Input :- Array elements: { }
Output :- Array is empty                */


import java.util.Scanner;
public class Ass18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		if(a.length==0){
			System.out.print("Array is empty !!");	
		}else{
			System.out.print("Array is not empty !!");	
		}
	}
}
