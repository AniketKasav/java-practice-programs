/*73. Implement your own version of `String.indexOf()`.

The idea of indexOf() is to search for a character or substring inside a string and return the index of its first occurrence.
Example 1: Find a character
Suppose:
String = "Hello"
Search for = 'l'
Check each character from left to right:
Index	Character	Match with 'l'?
0	H	❌
1	e	❌
2	l	✅

The first 'l' is found at index 2.
Result = 2
Simple Logic

Start from index 0 and search from left to right.
If a match is found → return its first index
If no match is found → return -1                      */

import java.util.Scanner;
public class Ass73{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1=sc.nextLine();
		System.out.println("Enter the character you want to search :");
		char ch=sc.nextLine().charAt(0);
		int ans=-1;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)==ch){
				ans=i;
				break;
			}
		}
		if(ans==-1){
			System.out.println("Character not found");
		}else{
			System.out.printf("The first '%c' is found at index %d.",ch,ans);
		}
		
	}
}