/*49. Count the number of sentences in a paragraph.

Example 1
Input Paragraph:
Java is a programming language. It is object-oriented. It is widely used.

Sentences:
Java is a programming language.
It is object-oriented.
It is widely used.

Output:
Number of sentences = 3 */

import java.util.*;
public class Ass49{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.replaceAll("[^.!?]","");
		System.out.println("Number of sentences ="+str.length());
		
	}
}