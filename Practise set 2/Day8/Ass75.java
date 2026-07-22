//75. Implement string compression (Example: aaabbcc → a3b2c2).

import java.util.Scanner;
public class Ass75{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String str=sc.nextLine();
		int count=0;
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			count=0;
			while(i<str.length() && ch==str.charAt(i)){
				count++;
				i++;
			}
			i--;
			sb.append(ch).append(count);
		}
		
		System.out.println("Result : "+sb);
		
	}
}