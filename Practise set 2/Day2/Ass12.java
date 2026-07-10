/*12. Find the first occurrence of a character.

Example:
String: computer
Character to find: p

Positions:
c → 0
o → 1
m → 2
p → 3 ← First occurrence

Result: The first occurrence of the character p is at index 3.  */

import java.util.Scanner;

public class Ass12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		System.out.println("Enter the Character to find(first occurrence):");
		char ch =sc.nextLine().charAt(0);
		int idx=-1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				idx=i;
				break;
			}
		}
		if(idx!=-1){
			System.out.printf("The first occurrence of the character %c is at index %d.",ch,idx);
		}else{
			System.out.println("Character not found in string ");
		}
	}
}