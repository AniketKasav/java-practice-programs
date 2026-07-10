/*14. Remove all white spaces from a string.

Example:
Original String: "Java Programming Language"
After Removing White Spaces: "JavaProgrammingLanguage" */

import java.util.Scanner;
public class Ass14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("\nOriginal String: "+str);
	
		str=str.replaceAll("[\\s+]","");
		System.out.println("After Removing White Spaces: "+str);
	}	
}