//7. Convert a string to uppercase.

import java.util.Scanner;
public class Ass7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		
		//System.out.println("uppercase :"+str.toUpperCase());
		
		//or
		StringBuilder sb=new StringBuilder();
		//str=str.replaceAll("[^A-Za-z]","");
		//System.out.println(str);
		for(char ch:str.toCharArray()){
			if(ch>='a' && ch<='z'){
				ch=(char)(ch-32);
				sb.append(ch);
			}else{
				sb.append(ch);
			}
		}
		System.out.println("uppercase :"+sb);
	}
}