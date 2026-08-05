/*9. Next Greater Element
Difficulty: Medium
Problem Statement
Given an integer array, find the next greater element for every element using a Stack. If no greater element exists, print -1.
Example
Input:
[4, 5, 2, 25]
Output:
5 25 25 -1         */

import java.util.*;

public class Ass9{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements in array :");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int []arr=new int[n];
		int []ans=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		Stack<Integer>st=new Stack<>();
		for(int i=n-1;i>=0;i--){
			while(!st.isEmpty() && st.peek()<=arr[i]){
					st.pop();
				}
			if(st.isEmpty()){
				ans[i]=-1;
				st.push(arr[i]);
			}else{
				ans[i]=st.peek();
				st.push(arr[i]);
			}
			
		}
		
		System.out.println("Output :");
		for(int k:ans){
			System.out.print(k+"\t");
		}
	}
		
}
