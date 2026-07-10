/*16. Find the ASCII value of each character.

Example:
String: "Cat"
Character	ASCII Value
C	67
a	97
t	116

Result:

C → 67
a → 97
t → 116     */

import java.util.Scanner;
public class Ass16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Character\tASCII Value");
		for(int i=0;i<str.length();i++){
			System.out.println(str.charAt(i)+"                "+(int)str.charAt(i));
		}
		
	}
}