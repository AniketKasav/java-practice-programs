/*11. Count the occurrences of a particular character.
Example:

Example:

String: banana
Character to count: a

Counting:

b → no
a → yes (1)
n → no
a → yes (2)
n → no
a → yes (3)

Result: The character a occurs 3 times in the string "banana"*/

import java.util.Scanner;
public class Ass11{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		System.out.println("Enter the Character to count:");
		char ch=sc.next().charAt(0);
		int count =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.printf("The character %c occurs %d times in the string %s",ch,count,str);
	}
}