/*56. Print all suffixes of a string.
A suffix of a string is any substring that ends at the last character and starts from some position.

Example 1
Input:
abcde

Output:
abcde
bcde
cde
de
e

Example 2
Input:
cat

Output:
cat
at
t       */

import java.util.Scanner;
public class Ass56{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			System.out.println(str.substring(i,str.length()));
		}
		
	}
}