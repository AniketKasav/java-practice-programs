/*33. Toggle the case of each character.

Example:
Input:
Hello World

Output:
hELLO wORLD

Explanation:
H → h
e → E
l → L
l → L
o → O
Space remains unchanged.
W → w
o → O
r → R
l → L
d → D
Only alphabetic characters change case; spaces, digits, and special characters remain the same.  */

import java.util.Scanner;
public class Ass33{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z'){
				ch=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z'){
				ch=(char)(ch+32);
			};
			sb.append(ch);
		}
		System.out.println("Output:\n");
		System.out.println(sb);
	}
}