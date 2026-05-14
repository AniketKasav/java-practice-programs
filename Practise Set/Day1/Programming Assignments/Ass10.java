/* 10. Concatenate Two Strings (No LeetCode)
Given two strings, combine them into a single string and return the result. The original order of
characters must remain unchanged.
Example: Input: "Hello", "World" → Output: "HelloWorld"   */

import java.util.Scanner;
class Ass10{
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string1 : ");
		String str1=sc.nextLine();
		System.out.println("Enter  string2 : ");
		String str2=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str1.length();i++){
			sb.append(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++){
			sb.append(str2.charAt(i));
		}
		System.out.print("Output : "+sb.toString());
    }
}