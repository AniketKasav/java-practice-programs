/*66. Find the common prefix of two strings.

Simple example:
String 1: "flower"
String 2: "flowing"

Common prefix: "flow" ✅
Because both strings start with:
f → fl → flo → flow
After that:
"flower" has e
"flowing" has i
So we stop.

Another example:
String 1: "programming"
String 2: "programmer"
Common prefix: "programm" */

import java.util.Scanner;
public class Ass66{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1 :");
		String str1=sc.nextLine();
		System.out.println("Enter the string2 :");
		String str2=sc.nextLine();
		int l=Math.min(str1.length(),str2.length());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<l;i++){
			if(str1.charAt(i)==str2.charAt(i)){
				sb.append(str1.charAt(i));
			}else{
				break;
			}
		}
		System.out.println("Common prefix:"+sb);
	}
}