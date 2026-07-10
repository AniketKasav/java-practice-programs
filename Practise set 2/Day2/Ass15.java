/*15. Count the number of words in a sentence.

Example:
Sentence: "Java is a powerful programming language"

Words:
Java
is
a
powerful
programming
language

Result: The sentence contains 6 words. */

import java.util.Scanner;
public class Ass15{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String []s=str.split("\\s+");
		int n=s.length;
		System.out.printf("The sentence contains %d words.",n);
		
	}
}