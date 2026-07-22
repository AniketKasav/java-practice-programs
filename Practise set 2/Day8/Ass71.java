/*71. Implement your own version of `String.equals()`.

Example
Suppose:
String 1 = "Hello"
String 2 = "Hello"

Your custom equals() logic would work like this:

First, check whether both strings have the same length.
"Hello" → 5 characters
"Hello" → 5 characters
Length is the same, so continue.
Compare each character at the same position:
H == H ✅
e == e ✅
l == l ✅
l == l ✅
o == o ✅
Since all characters are the same, return true.  */

import java.util.Scanner;
public class Ass71{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1 :");
		String str1=sc.nextLine();
		System.out.println("Enter String2 :");
		String str2=sc.nextLine();
		if(str1.length()!=str2.length()){
			System.out.println("Strings are not equal");
			System.exit(0);
		}
		boolean flag=true;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Given Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}
	}
}