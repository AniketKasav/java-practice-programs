/*21. Find the largest character in a string.

Example 1
Input:
String = "apple"

Output:
p

Explanation:
Characters in the string are:
a
p
p
l
e

Based on their ASCII/Unicode values:
a = 97
e = 101
l = 108
p = 112

The largest character is p.      */


import java.util.Scanner;
public class Ass21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char largest=' ';
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>largest){
				largest=str.charAt(i);
			}
		}
		System.out.printf("The largest character is %c.",largest);
		
	}
}