/*Q27. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.   */

import java.util.Scanner;
public class Ass27{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		System.out.println("Enter array elements : ");
		int []a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int [] visited=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			count=0;
			if(visited[i]==1){
				continue;
			}
			for(int j=0;j<n;j++){
				if(a[i]==a[j]){
					count++;
					visited[j]=1;
				}
				
			}
			System.out.printf("%d -> %d times \n",a[i],count);
		}
		
	}
}
