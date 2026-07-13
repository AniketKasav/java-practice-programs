/*29. Remove all digits from a string.

Example
Input:
String = "abc123def45"

Output:
abcdef

Explanation:
The digits (1, 2, 3, 4, 5) are removed from the string,
leaving only the alphabetic characters abcdef.            */

import java.util.Scanner;
public class Ass27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Output:");
		str=str.replaceAll("[0-9]","");
		System.out.println(str);
	}
}