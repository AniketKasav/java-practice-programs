/*78. Find all permutations of a string.
A permutation means finding all possible arrangements of the characters in a string.

Simple Example
Suppose:
Input: ABC

All possible arrangements are:
ABC
ACB
BAC
BCA
CAB
CBA
So there are 6 permutations.   */

import java.util.Scanner;
public class Ass78{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		int count=0;
		
		char[] arr=str.toCharArray();
		
		permutations(arr,0);
		
	}
	
	public static void permutations(char[] arr,int idx){
		if(idx==arr.length){
			System.out.println(new String(arr));
			return;
		};
		for(int i=idx;i<arr.length;i++){
			char temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
			permutations(arr,idx+1);
			temp=arr[idx];
			arr[idx]=arr[i];
			arr[i]=temp;
		}
		
	}
}