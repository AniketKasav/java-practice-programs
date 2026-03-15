/*Q32. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]
Explanation:
10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.        */

import java.util.Scanner;
public class Ass32{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Program for Replace all elements in the array that are multiples of 5 with the number 5 itself.");
		System.out.print("Enter the Array Size : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			if(a[i]%5==0){
				a[i]=5;
			}
		}
		
		System.out.print("Output : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
}