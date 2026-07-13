/*36. Reverse each word in a sentence.

Example:
Input:
Hello World Java

Output:
olleH dlroW avaJ

Explanation:
Hello → olleH
World → dlroW
Java → avaJ

The order of the words remains the same, but the characters within each word are reversed. Spaces are preserved. */

import java.util.Scanner;
public class Ass36{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		StringBuilder word=new StringBuilder();
		StringBuilder ans=new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch!=' '){
                word.insert(0,ch);
            }else{
                ans.append(word).append(" ");
                word.setLength(0);
            }
		}
		ans.append(word);
		System.out.println("OutPut : \n"+ans);
	}
}