/*65. Check whether a string ends with a given suffix.

Simple example:
String: "Hello World"
Suffix: "World"

Result: true ✅
Because "Hello World" ends with "World".

Another example:
String: "programming.java"
Suffix: ".java"

Result: true ✅

One false case:
String: "image.png"
Suffix: ".jpg"

Result: false ❌
If solving it without endsWith() */

import java.util.Scanner;
public class Ass65{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Enter the prefix string :");
		String suffix=sc.nextLine();
		int n=suffix.length();
		boolean flag=true;
		int diff=str.length()-suffix.length();
		for(int i=n-1;i>=0;i--){
			if(str.charAt(i+diff)!=suffix.charAt(i)){
				flag=false;
				break;
			}
		}
		System.out.printf("Result :"+flag);
	}
}