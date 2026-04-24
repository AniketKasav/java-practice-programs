//Write a program to take a string a s input and count number of vowels, consonents, digits, special symbol

import java.util.Scanner;
public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		int vowelsCount=0,consonentsCount=0,digitCount=0,specialCount=0;
		//System.out.println((int)'A');  //a=97   A=65  0=48
		//System.out.println((int)'Z');  //z=122  Z=90  9=57
		String str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='o'||ch=='u'||ch=='i'||ch=='e'){
				vowelsCount++;
			}else if(ch>=97 && ch<=122){
				consonentsCount++;
			}else if(ch>=48 && ch<=57){
				digitCount++;
			}else{
				specialCount++;
			}
		}
		
		System.out.println("Count of vowels : "+vowelsCount);
		System.out.println("Count of consonents : "+consonentsCount);
		System.out.println("Count of digits : "+digitCount);
		System.out.println("Count of special symbol : "+specialCount);
		System.out.println("Total length of the String : "+str.length());
	}
}