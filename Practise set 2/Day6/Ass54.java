/*54. Print all substrings of a string.
A substring is a contiguous sequence of characters within a string.

Example
Input:
abc

Output:
a
ab
abc
b
bc
c

Another Example
Input:
cat

Output:
c
ca
cat
a
at
t   */

import java.util.Scanner;
public class Ass54{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				System.out.println(str.substring(i,j));
			}
		}
	}
}