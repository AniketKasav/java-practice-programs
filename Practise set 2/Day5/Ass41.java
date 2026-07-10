//41. Find the first non-repeated character.
/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1          */

import java.util.Scanner;
class Ass41{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteer the string");
		String str=sc.nextLine();
		
		int freq[]=new int[26];
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;
		}
		
		boolean flag=false;
		int idx=-1;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(freq[ch-'a']==1){
				flag=true;
				idx=i;
				break;
			}
		}
		if(flag){
			System.out.println("Unique element found at "+idx);
		}else{
			System.out.println("Unique element not found "+idx);
		}
	}
}