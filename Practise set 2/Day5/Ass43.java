//43. Remove duplicate characters from a string.
/*Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"          */

import java.util.Scanner;
public class Ass43{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			boolean flag=true;
			for(int k=0;k<i;k++){
				if(str.charAt(i)==str.charAt(k)){
					flag=false;
					break;
				}
			}
			if(flag){
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println("Ans : "+sb.toString());
	}
}

