/*24. Check whether a string contains only alphabets.

Example
Input:
String = "Example"

Output:
The string contains only alphabets.

Explanation:
All characters in the string (E x a m p l e) are alphabetic letters, so the string contains only alphabets.  */

import java.util.Scanner;
public class Ass24{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if((ch<'a' || ch>'z' ) && (ch<'A' || ch>'Z')){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The string contains only alphabets.");
		}else{
			System.out.println("The string does not contains only alphabets.");
		}
	}
}