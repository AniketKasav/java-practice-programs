/*70. Convert a sentence into snake_case.

Sentence: "hello world java programming"
snake_case: "hello_world_java_programming"
Sentence: "my name is john"
snake_case: "my_name_is_john"    */

import java.util.*;
public class Ass70{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
		//str=str.replaceAll(" ","_");
		StringBuilder sb=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++){
			char ch=str.charAt(i);
			if(ch==' '){
				sb.append("_");
			}else{
				sb.append(ch);
			}
		}
		
		System.out.println("camelCase :"+sb);
	}
}