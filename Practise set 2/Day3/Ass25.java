/*25. Check whether a string contains only uppercase letters.

Example
Input:
String = "HELLO"

Output:
The string contains only uppercase letters.

Explanation:
All characters in the string (H, E, L, L, O) are uppercase letters, 
so the string contains only uppercase letters.   */

import java.util.Scanner;
public class Ass25{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>'Z' || ch<'A'){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The string contains only uppercase letters.");
		}else{
			System.out.println("The string does not contains only uppercase letters.");
		}
	}
}