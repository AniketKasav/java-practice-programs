//8. Convert a string to lowercase.

import java.util.Scanner;
public class Ass8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string ");
		String str=sc.nextLine();
		
		//System.out.println("lowercase :"+str.toLowerCase());
		
		//or
		StringBuilder sb=new StringBuilder();
		//str=str.replaceAll("[^A-Za-z]","");
		//System.out.println(str);
		int diff=((int)'A')-((int)'a');
		//System.out.println(diff);
		for(char ch:str.toCharArray()){
			if(ch>='A' && ch<='Z'){
				ch=(char)(ch-diff);
				sb.append(ch);
			}else{
				sb.append(ch);
			}
		}
		System.out.println("lowercase :"+sb);
	}
}