//Find the first repeated character.

import java.util.Scanner;
public class Ass42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.nextLine();
		
		int freq[]=new int[26];
		str=str.toLowerCase();
		boolean flag=false;
		String ans="";
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;
			if(freq[ch-'a']>=2){
				flag=true;
				ans=ans+ch;
				break;
			}
		}
		
		if(flag){
			System.out.println("First Repeated Character is "+ans);
		}else{
			System.out.println("There is no repeated character present");
		}
		
	}
}