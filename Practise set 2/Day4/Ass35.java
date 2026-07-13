/*35. Find the frequency of every character in a string.
(only letter allowed)
Example:
Input
programming

Output:
p : 1
r : 2
o : 1
g : 2
a : 1
m : 2
i : 1
n : 1

Explanation:
p appears 1 time.
r appears 2 times.
o appears 1 time.
g appears 2 times.
a appears 1 time.
m appears 2 times.
i appears 1 time.
n appears 1 time.
Typically, each distinct character is printed once along with the number of times it appears in the string.*/

import java.util.Scanner;
public class Ass35{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string(only letter allowed)");
		String str=sc.nextLine();
		int [] freq=new int[26];
		str=str.replaceAll("[^A-Za-z]","");
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
			freq[str.charAt(i)-'a']++;
		}
		
		System.out.println("Output:");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(freq[ch-'a']!=-1){System.out.printf("%c : %d%n",ch,freq[ch-'a']);}
			freq[ch-'a']=-1;
		}
		
	}
}
 
