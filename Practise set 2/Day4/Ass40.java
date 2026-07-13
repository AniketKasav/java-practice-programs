/*40. Find non-repeated characters in a string.

Example:
Input:
programming

Output:
p
o
a
i
n

Explanation:
p, o, a, i, and n appear only once.
r, g, and m appear more than once, so they are not printed.

Another example:
Input:
banana

Output:
b

Explanation:
b appears only once.
a appears 3 times.
n appears 2 times.
Only characters with a frequency of 1 are considered non-repeated characters.  */


import java.util.Scanner;
public class Ass40{
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
			if(freq[ch-'a']==1){
				System.out.printf("%c : %d%n",ch,freq[ch-'a']);
				freq[ch-'a']=-1;
			}
		}
	}
}