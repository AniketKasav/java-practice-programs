/*68. Convert a sentence into camelCase.

Sentence: "hello world java programming"
camelCase: "helloWorldJavaProgramming"
Sentence: "my name is john"
camelCase: "myNameIsJohn"             */

import java.util.*;
public class Ass68{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(ch==' '){
				i++;
				ch=(char)(str.charAt(i)-32);
				sb.append(ch);
			}else{
				sb.append(ch);
			}
		}
		
		System.out.println("camelCase :"+sb);
	}
}