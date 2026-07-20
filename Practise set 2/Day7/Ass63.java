/*63. Replace all occurrences of one substring with another.

Simple example:

String: "I like cats. Cats are cute."
Substring to replace: "cats"
Replace with: "dogs"

After replacement:
Result: "I like dogs. Cats are cute."

Note: This is case-sensitive, so "cats" is replaced, but "Cats" is not.

Another example with multiple occurrences:

String: "apple mango apple banana apple"
Replace: "apple"
With: "orange"

Result: "orange mango orange banana orange"  */

import java.util.Scanner;

public class Ass63{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("String to replace :");
		String sub1=sc.nextLine();
		System.out.println("Replace with :");
		String sub2=sc.nextLine();
		int n=str.length();
		int m=sub1.length();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){
			if(str.charAt(i)==sub1.charAt(0) && str.substring(i,i+m).equals(sub1)){
				sb.append(sub2);
				i+=(m-1);
			}else{
				sb.append(str.charAt(i));
			}
		}
		System.out.printf("Result :"+sb);
	}
}