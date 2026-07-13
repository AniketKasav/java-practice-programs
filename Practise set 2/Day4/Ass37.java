/*37. Reverse the order of words in a sentence.

Example:
Input:
The sky is blue

Output:
blue is sky The

Explanation:
Original words: The, sky, is, blue
Reversed order: blue, is, sky, The

Only the order of the words changes. The letters within each word remain unchanged.  */

import java.util.Scanner;
public class Ass37{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		StringBuilder word=new StringBuilder();
		StringBuilder ans=new StringBuilder();
		
		for(char ch:str.toCharArray()){
			if(ch!=' '){
				word.append(ch);
			}else{
				ans.insert(0,word).insert(0," ");
				word.setLength(0);
			}
		}
		ans.insert(0,word);
		System.out.println("Output :"+ans);
	}
}