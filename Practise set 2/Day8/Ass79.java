/*79. Find all combinations of characters in a string.

This is similar to permutations, but there is an important difference.
Suppose:
Input: ABC
All non-empty combinations/subsets are:

A
B
C
AB
AC
BC
ABC

There are 7 combinations.
Notice:
AB and BA
not considered different combinations. We only take AB.
In permutation:
ABC
ACB
BAC
BCA
CAB
CBA

Order matters.
In combinations:
A, B, C, AB, AC, BC, ABC
Order does not matter.             */


import java.util.Scanner;
public class Ass79{
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