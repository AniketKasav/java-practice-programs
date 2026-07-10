/*55. Print all prefixes of a string.
A prefix of a string is any substring that starts from the first character and ends at some position.
Example 1

Input:
abcde

Output:
a
ab
abc
abcd
abcde

Example 2
Input:
cat

Output:
c
ca
cat       */

import java.util.Scanner;
public class Ass55{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		for(int i=1;i<=str.length();i++){
			System.out.println(str.substring(0,i));
		}
		
	}
}