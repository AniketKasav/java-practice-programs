/*
Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.      */


import java.util.Scanner;
public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements of array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int j=0;j<a.length;j++){
			sum+=a[j];
		}
		
		System.out.println("The sum of all array elements : "+sum);
	}
}
