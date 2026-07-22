/*80. Find all subsequences of a string.

This problem is almost the same as Q79 (find all combinations) when you generate all non-empty subsequences.
A subsequence is formed by taking some characters from the original string without changing their original order.

For example:
Input: ABC

All non-empty subsequences are:
A
B
C
AB
AC
BC
ABC

Notice:

AB ✅ because A comes before B in "ABC"
AC ✅
BC ✅
BA ❌ because it changes the original order   */

import java.util.Scanner;
public class Ass80{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		int count=0;
		char[] arr=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		System.out.println("------------------------------");
		combinations(arr,0,sb);
		
	}
	
	public static void combinations(char[] arr,int idx,StringBuilder sb){
		if(idx==arr.length){
			System.out.println(sb);
			return;
		};
		combinations(arr,idx+1,sb.append(arr[idx]));
		sb.deleteCharAt(sb.length()-1);
		combinations(arr,idx+1,sb);
		
		
		
	}
}