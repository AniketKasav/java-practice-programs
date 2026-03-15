/*Q35. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.  */

import java.util.Scanner;
public class Ass35{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Create a new array where each element is the square of the original.");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements(even and odd elements is equal) : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			a[i]=a[i]*a[i];
		}
		
		System.out.print("OutPut : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}