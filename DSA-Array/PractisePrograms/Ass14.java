/*Q14.  Write a java program to remove duplicated values from arrays.

Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, 
thus avoiding duplicates.  */

import java.util.Scanner;
public class Ass14{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int result[]=new int[n];
		
		System.out.println("Enter the array elements  ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		// remove duplicate elements 
		int temp,count=0;
		boolean flag;
		for(int i=0;i<a.length;i++){
			temp=a[i];
			flag=true;
			for(int j=0;j<count;j++){
				if(result[j]==temp){
					flag=false;
					break;
				}
			}
			if(flag){
				result[count]=temp;
				count++;
			}
		}
		System.out.print("Unique elements = ");
		for(int i=0;i<count;i++){
			System.out.print(result[i]+" ");
		}
	}
}