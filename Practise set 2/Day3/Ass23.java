/*23. Check whether a string contains only digits.

Example
Input:
String = "123456"

Output:
The string contains only digits.

Explanation:
All characters in the string (1, 2, 3, 4, 5, 6) are digits, so the string contains only digits.  */

import java.util.Scanner;
public class Ass23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<'0' || ch>'9'){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The string contains only digits.");
		}else{
			System.out.println("The string does not contains only digits.");
		}
	}
}