/*Q36. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeated multiplication, and update the array element with this value. */

import java.util.Scanner;
public class Ass36{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to Replace each element of array with its factorial..");
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements  : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int temp,fact;
		for(int i=0;i<n;i++){
			temp=a[i];
			fact=1;
			for(int j=2;j<=temp;j++){
				fact=fact*j;
			}
			a[i]=fact;
		}
		
		System.out.print("OutPut : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
