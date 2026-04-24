//2.Write a program to find the sum of digit present in given string
//Ex.  Given String  :  sth3j5j1jj     
//       output  : 3+5+1 = 9

import java.util.Scanner;
public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a String : ");
		String str ="sth3j5j1jj";
		System.out.println(str);
		//System.out.println((int)('0'));    //48
		//System.out.println((int)('9'));    //57
		int sum=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>=48 && ch<=57){
				sum=sum+((int)ch-48);
			}
		}
		System.out.println("The sum of digit present in given string : "+sum);
	}
}