/*53. Check whether a string is a pangram.
A pangram is a sentence that contains every letter of the English alphabet (a–z) at least once.

Example 1 (Pangram)

Input:

"The quick brown fox jumps over the lazy dog"

Output:

true

Reason: It contains all 26 letters from a to z.    */

import java.util.Scanner;
public class Ass53{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str=sc.nextLine();
		str=str.replaceAll("[^a-z0-9]","");
		int freq[]=new int[26];
		for(char ch:str.toCharArray()){
			freq[ch-'a']++;
		}
		boolean flag=true;
		for(int i=0;i<26;i++){
			if(freq[i]==0){
				flag=false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Given string is a pangram");
		}else{
			System.out.println("Given string is not a pangram");
		}
	}
}