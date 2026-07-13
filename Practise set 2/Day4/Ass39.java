/*39. Find duplicate characters in a string.

Example:
Input:
programming

Output:
r : 2
g : 2
m : 2

Explanation:
r appears 2 times.
g appears 2 times.
m appears 2 times.
All other characters appear only once, so they are not printed.

Another example:
Input:
banana

Output:
a : 3
n : 2

Only the characters that appear more than once are considered duplicate characters.   */

import java.util.Scanner;
public class Ass39{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		str=str.replaceAll("[^A-Za-z]","").toLowerCase();
		int freq[]=new int[26];
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;
		}
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(freq[ch-'a']>1){
				System.out.printf("%c : %d%n",ch,freq[ch-'a']);
				freq[ch-'a']=-1;
			}
		}
	}
}