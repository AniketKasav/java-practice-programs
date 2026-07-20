/*62. Find the number of occurrences of a substring.

String: "hello hello hello"
Substring: "hello"

The substring "hello" occurs 3 times. 

String: "banana"
Substring: "ana"

The substring "ana" occurs 2 times in "banana".

Answer: 2
*/

import java.util.Scanner;

public class Ass62{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Enter the substring");
		String substr=sc.nextLine();
		int ans=0;
		int n=str.length();
		int m=substr.length();
		for(int i=0;i<=n-m;i++){
			if(str.charAt(i)==substr.charAt(0) && str.substring(i,i+m).equals(substr)){
				ans++;
			}
		}
		System.out.printf("The substring %s occurs %d times in %s.",substr,ans,str);
	}
}