/*34. Convert the first character to uppercase.
Convert the first character of each word to uppercase

Input:
hello world from java

Output:
Hello World From Java

Explanation:
hello → Hello
world → World
from → From
java → Java

Another example:
Input:
i love programming

Output:
I Love Programming

Only the first letter of each word is converted to uppercase. The remaining letters stay as they are.         */

import java.util.Scanner;
public class Ass34{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		boolean flag=true;
		char chh[]=str.toCharArray();
		for(int i=0;i<chh.length;i++){
			char ch=chh[i];
			if(flag){
				if(ch>='a' && ch<='z'){
					chh[i]=(char)(ch-32);
					flag=false;
				}else{
					flag=false;
				}
			}
			if(ch==' ')flag=true;
			
		}
		
		StringBuilder sb=new StringBuilder();
		for(char ch:chh){
			sb.append(ch);
		}
		
		System.out.println("Output:\n"+sb);
	}
}
 
