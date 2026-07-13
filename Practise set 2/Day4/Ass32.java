/*32. Count uppercase and lowercase letters separately.

Here's one example:
Input:
Hello World 123!

Output:
Uppercase letters: 2
Lowercase letters: 8

Explanation:
Uppercase: H, W → 2
Lowercase: e, l, l, o, o, r, l, d → 8
Spaces, numbers, and symbols are not counted.  */


import java.util.Scanner;
public class Ass32{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int UpperCount=0,LowerCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')LowerCount++;
			else if(ch>='A' && ch<='Z')UpperCount++;
		}
		System.out.println("Output:\n"+str);
		System.out.printf("Uppercase letters: %d%nLowercase letters: %d%n",UpperCount,LowerCount);
	}
}