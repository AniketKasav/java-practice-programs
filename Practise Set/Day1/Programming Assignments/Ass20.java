/*20. Find ASCII Value of Characters (No LeetCode)
Given a character or string, print the ASCII value corresponding to each character.
Example: Input: "A" → Output: 65  */

import java.util.Scanner;
class Ass20{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  String : ");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			char ch =str.charAt(i);
			System.out.printf("%c --> %d \n",ch,(int)ch);
		}
    }
}