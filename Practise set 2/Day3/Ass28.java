/*28. Print characters at odd indexes.

Example
Input:
String = "program"

Output:
r
g
a

Explanation:
The characters at odd indexes are:

Index 1 → r
Index 3 → g
Index 5 → a    */

import java.util.Scanner;
public class Ass27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Output:");
		for(int i=1;i<str.length();i+=2){
			System.out.printf("Index %d -> %c %n",i,str.charAt(i));
		}
	}
}