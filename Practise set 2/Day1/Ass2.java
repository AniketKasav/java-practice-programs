//2. Find the length of a string without using `length()`.


import java.util.Scanner;

public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int len=0;
		for(char ch:str.toCharArray()){
			len++;
		}
		System.out.println("The length of the string is "+len);
	}
}