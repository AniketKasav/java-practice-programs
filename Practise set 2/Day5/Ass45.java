//45. Find the minimum occurring character.

import java.util.Scanner;
public class Ass45{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int freq[]=new int[26];
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;
		}
		int idx=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<26;i++){
			if(freq[i]>0 && freq[i]<min){
				min=freq[i];
				idx=i;
			}
		}
		
		System.out.println("Minimum occurring character : "+(char)(idx+'a'));
	}
}