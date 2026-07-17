/*50. Find the longest word in a sentence.

Example 1
Input:
Java is a powerful programming language

Words:
Java
is
a
powerful
programming
language

Output:
Longest word = programming
Length = 11                    */

import java.util.*;
public class Ass50{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		String []arr=str.trim().replaceAll("[^A-Za-z\\s]","").split("\\s+");
		int idx=-1;
		int length=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(length<arr[i].length()){
				length=arr[i].length();
				idx=i;
			}
		}
		System.out.printf("Longest word = %s %nLength = %d ",arr[idx],length);
	}
}