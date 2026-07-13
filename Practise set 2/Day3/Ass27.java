/*27. Print characters at even indexes.

Example
Input:
String = "program"

Output:
p
o
r
m

Explanation:
The characters at even indexes are:

Index 0 → p
Index 2 → o
Index 4 → r
Index 6 → m        */

import java.util.Scanner;
public class Ass27{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Output:");
		for(int i=0;i<str.length();i+=2){
			System.out.printf("Index %d -> %c %n",i,str.charAt(i));
		}
	}
}