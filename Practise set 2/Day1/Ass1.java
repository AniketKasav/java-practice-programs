//1. Print each character of a string.


import java.util.Scanner;
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("The character of the array");
		for(char ch:str.toCharArray()){
			System.out.println(ch);
		}
		
	}
}