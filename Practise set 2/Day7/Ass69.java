/*69. Convert camelCase into a normal sentence.

camelCase: "helloWorldJavaProgramming"
Sentence: "hello world java programming"
camelCase: "myNameIsJohn"
Sentence: "my name is john"    */

import java.util.*;
public class Ass69{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z'){
				ch=(char)(ch+32);
				sb.append(" ").append(ch);
			}else{
				sb.append(ch);
			}
		}
		
		System.out.println("camelCase :"+sb);
	}
}