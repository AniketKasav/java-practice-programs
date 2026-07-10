/*20. Concatenate two strings without using `concat()` .

Example:
String 1: "Hello"
String 2: "World"

Concatenation (using + operator):

"Hello" + " " + "World"

Result: "Hello World"      */

import java.util.Scanner;

public class Ass20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.nextLine();
		System.out.println("Enter String 2");
		String str2=sc.nextLine();
		
		//System.out.println(str1+str2);
		
		// and if '+' operator is not allowed then 
		
		StringBuilder sb=new StringBuilder(str1);
		for(int i=0;i<str2.length();i++){
			sb.append(str2.charAt(i));
		}
		System.out.println("Result: "+sb);
		
	}
}