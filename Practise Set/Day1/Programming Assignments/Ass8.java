/*8. Remove Spaces from String (LC 1592 Inspired)
Given a string containing spaces, remove all spaces and return the updated string without
changing the order of remaining characters.
Example: Input: "a b c d" → Output: "abcd"   */

import java.util.Scanner;
class Ass8{
    public static void main(String[] args) {
		// convert the strign in character array and then count the character in array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch!=' '){
				sb.append(ch);
			}
		}
		System.out.print("Output : "+sb.toString());
    }
}