/* Q53. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].          */

import java.util.Scanner;
public class Ass53{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("target = ");
		int target=sc.nextInt();
		//output
		int f=-1,l=-1;
		boolean flag;
		for(int i=0;i<n-1;i++){
			flag=false;
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==target){
					f=i;
					l=j;
					flag=true;
					break;
				}	
			}
			if(flag){
					break;
				}
		}
		System.out.printf("[%d, %d]",f,l);
		
	}
}