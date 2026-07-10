//58. Find the longest palindromic substring.
/*Given a string s, return the longest palindromic substring in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"                */

import java.util.*;
public class Ass58{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int odd=0;
		int even=0;
		int maxlen=0;
		int st=0;
		int end=0;
		for(int i=0;i<str.length();i++){
			odd=helpher(str,i,i);
			even=helpher(str,i,i+1);
			maxlen=Math.max(odd,even);
			if(maxlen>end-st){
				st=i-(maxlen-1)/2;	
				end=i+(maxlen/2);
			}
		}
		System.out.println("Output:"+str.substring(st,end+1));
	}
	
	static int helpher(String str,int l,int r){
		while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
			l--;
			r++;
		}
		return r-l-1;
	}
}