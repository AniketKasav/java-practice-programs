//44. Find the maximum occurring character.

import java.util.Scanner;
public class Ass44{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int freq[]=new int[26];
		int idx=-1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;
			if(freq[ch-'a']>max){
				max=freq[ch-'a'];
				idx=i;
			}
		}
		
		System.out.println("maximum occurring character : "+str.charAt(idx));
	}
}