/*82. Find the longest repeating subsequence.

Input:
AABEBCDD

Output:
ABD

Explanation: ABD appears twice as a subsequence, using different character positions.
So the Longest Repeating Subsequence is ABD, and its length is 3.
Important: A subsequence does not need to be continuous.
For now, think of the problem as:
Find the longest sequence of characters that can be formed at least twice in the same string using different indices.  */

import java.util.Scanner;
public class Ass82{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		//StringBuilder sb=new StringBuilder();
		String[][] memo=new String[arr.length][arr.length];
		System.out.println(solve(arr,memo,0,0));
	}
	
	public static String solve(char[] arr,String[][] memo,int i,int j){
		if(i==arr.length || j==arr.length || i<0 || j<0){
			return "";
		}
		if(memo[i][j]!=null){
			return memo[i][j];
			
		}
		
		if(arr[i]==arr[j] && i!=j){
			memo[i][j]=arr[i]+solve(arr,memo,i+1,j+1);
			return memo[i][j];
		}
		String s1=solve(arr,memo,i+1,j);
		String s2=solve(arr,memo,i,j+1);
		memo[i][j]=(s1.length()>s2.length())?s1:s2;
		return memo[i][j];
	}
}