//Write a program to find the number of  occurance of a given character in a given string

import java.util.Scanner;
public class Ass5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=sc.nextLine();
		System.out.println("Enter the character to find the number of  occurance of a given character in a given string !!");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("The count of the given character in String : "+count);
	}
}