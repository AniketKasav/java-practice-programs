/*22. Find the smallest character in a string.
Input:
String = "apple"

Output:
a

Explanation:
The characters are a, p, p, l, e. Comparing their ASCII/Unicode values, a is the smallest character.  */

import java.util.Scanner;
public class Ass22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		char smallest=str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)<smallest){
				smallest=str.charAt(i);
			}
		}
		System.out.printf("The smallest character is %c.",smallest);
		
	}
}