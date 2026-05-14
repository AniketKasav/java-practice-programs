/*13. Print Duplicate Characters (No LeetCode)
Given a string, identify and print all characters that occur more than once in the string. Each
duplicate character should be printed only once.
Example: Input: "programming" → Output: "r g m"    */

import java.util.Scanner;
class Ass13{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string : ");
		String str=sc.nextLine();
		int []freq=new int[26];
		for(int i=0;i<str.length();i++){
			freq[str.charAt(i)-'a']++;
		}
		/*for(int i=0;i<freq.length;i++){
			if(freq[i]>1){
				System.out.print((char)(i+'a')+" ");
			}
		}*/
		for(int i=0;i<str.length();i++){
			if(freq[str.charAt(i)-'a']>1){
				System.out.print(str.charAt(i)+" ");
			}
			freq[str.charAt(i)-'a']--;
		}
    }
}