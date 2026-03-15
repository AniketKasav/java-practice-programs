/*Q26. Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3                                        */

import java.util.Scanner;
public class Ass26{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the sum : ");
		int sum=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j]+a[i]==sum){
					count++;
				}
			}
		}
		
		System.out.printf("%d pairs in array have sum %d",count,sum);
		
	}
}

