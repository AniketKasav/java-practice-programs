/* 12. Replace Spaces with Hyphens (LC 1592 Inspired)
Given a string containing spaces, replace every space character with a hyphen (-) and return the
modified string.
Example: Input: "hello world" → Output: "hello-world" */

import java.util.Scanner;
class Ass12{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  string : ");
		String str=sc.nextLine();
		System.out.print("Output : "+str.replaceAll(" ","-"));
    }
}