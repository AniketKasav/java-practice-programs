/*60: Find all Palindromic Substrings
A palindromic substring is a substring that reads the same forward and backward.

Example 1
Input:
s = "abc"

Output:
a
b
c
Explanation:
Only single characters are palindromes.

Example 2
Input:
s = "aaa"

Output:
a
a
a
aa
aa
aaa
Explanation:
Palindromic substrings are:

a (index 0)
a (index 1)
a (index 2)
aa (0-1)
aa (1-2)
aaa (0-2)
Total = 6 palindromic substrings */

import java.util.*;
public class Ass60{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int odd=0;
		int even=0;
		for(int i=0;i<str.length();i++){
			odd=helpher(str,i,i);
			even=helpher(str,i,i+1);
		}
		//System.out.println("Output:"+str.substring(st,end+1));
	}
	
	static int helpher(String str,int l,int r){
		while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
			System.out.println(str.substring(l, r + 1));
			l--;
			r++;
		}
		return r-l-1;
	}
}

