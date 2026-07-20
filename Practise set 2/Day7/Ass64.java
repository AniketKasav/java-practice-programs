/*64. Check whether a string starts with a given prefix.

Simple example:
String: "Hello World"
Prefix: "Hello"

Result: true ✅
Because "Hello World" starts with "Hello".

Another example:
String: "Java Programming"
Prefix: "Programming"

Result: false ❌
Because "Java Programming" does not start with "Programming".

If you're solving it without using the built-in startsWith() method, think simply:
Compare the prefix with the beginning part of the main string.   */

import java.util.Scanner;
public class Ass64{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Enter the prefix string :");
		String prefix=sc.nextLine();
		int n=prefix.length();
		boolean flag=true;
		for(int i=0;i<n;i++){
			if(str.charAt(i)!=prefix.charAt(i)){
				flag=false;
				break;
			}
		}
		System.out.printf("Result :"+flag);
	}
}