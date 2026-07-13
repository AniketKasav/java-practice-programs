/*38. Check whether two strings are anagrams.
Example 1
Input:
listen
silent

Output:
Anagrams

Explanation:
Both strings contain the same letters with the same frequency, just in a different order.

Example 2
Input:
hello
world

Output:
Not Anagrams

Explanation:
The characters and their frequencies are different, so the strings are not anagrams.  */

import java.util.Scanner;
public class Ass38{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string1");
		String str1=sc.nextLine();	
		str1=str1.replaceAll("[^A-Za-z]","");
		str1=str1.toLowerCase();
		System.out.println("Enter the string2");
		String str2=sc.nextLine();
		str2=str2.replaceAll("[^A-Za-z]","");
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()){
			System.out.println("Not Anagrams");
			System.exit(0);
		}
		int []freq=new int[26];
		for(int i=0;i<str1.length();i++){
			freq[str1.charAt(i)-'a']++;
			freq[str2.charAt(i)-'a']--;
		}
		
		for(int i=0;i<26;i++){
			if(freq[i]!=0){
				System.out.println("Not Anagrams");
				System.exit(0);
			}
		}
		System.out.println("Anagrams");
	}
}