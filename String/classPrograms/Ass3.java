//Write a program to take a string from user and display it


import java.util.Scanner;
public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str=new String(sc.nextLine());
		// or String str=sc.nextLine();
		System.out.println("Display the String : "+str);
	}
}