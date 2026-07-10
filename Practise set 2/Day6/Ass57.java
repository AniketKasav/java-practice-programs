//57. Find the longest substring without repeating characters.
/*Example 1
Input:
abcabcbb

Substrings without repeating characters:
abc   ← length 3
bca   ← length 3
cab   ← length 3
abc   ← length 3

Output:
3
Longest substring: "abc"

Example 2
Input:
bbbbb
Output:
1
Longest substring: "b"   */

import java.util.*;
public class Ass57{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		HashSet<Character> set=new HashSet<>();
		int l=0;
		int maxlen=0;
		int startidx=0;
		for(int r=0;r<str.length();r++){
			while(set.contains(str.charAt(r))){
				set.remove(str.charAt(l));
				l++;
			}
			set.add(str.charAt(r));
			if(maxlen<r-l+1){
				maxlen=r-l+1;
				startidx=l;
			}
		}
		System.out.println("MaxLength : "+maxlen);
		System.out.println("Longest substring:"+str.substring(l,l+maxlen));
	}
}