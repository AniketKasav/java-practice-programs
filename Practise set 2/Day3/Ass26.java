/*26. Check whether a string contains only lowercase letters.

Example
Input:
String = "hello"

Output:
The string contains only lowercase letters.

Explanation:
All characters in the string (h, e, l, l, o) are lowercase letters,
 so the string contains only lowercase letters.   */
 
import java.util.Scanner;
public class Ass26{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		boolean flag=true;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>'z' || ch<'a'){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The string contains only lowercase letters.");
		}else{
			System.out.println("The string does not contains only lowercase letters.");
		}
	}
}