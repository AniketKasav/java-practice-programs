/*13. Find the last occurrence of a character.

Example:
String: banana
Character to find: a

Positions:
b → 0
a → 1
n → 2
a → 3
n → 4
a → 5 ← Last occurrence

Result: The last occurrence of the character a is at index 5.  */

import java.util.Scanner;
public class Ass13{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		System.out.println("Enter the Character to find: ");
		char ch=sc.nextLine().charAt(0);
		int idx=-1;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)==ch){
				idx=i;
				break;
			}
		}
		if(idx!=-1){
		System.out.printf("The last occurrence of the character %c is at index %d.",ch,idx);
		}else{
			System.out.println("Character not found in string");
		}
		
	}
}