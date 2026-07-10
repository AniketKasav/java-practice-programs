/*17. Replace all spaces with hyphens.

Example:

Original String: "Java Programming Language"
After Replacing Spaces with Hyphens:"Java-Programming-Language"

Result: All spaces are replaced with hyphens (-).  */

import java.util.Scanner;
public class Ass17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("\nOriginal String: "+str);
		str=str.replaceAll("\\s+","-");
		System.out.println("After Replacing Spaces with Hyphens: "+str);
		
	}
}