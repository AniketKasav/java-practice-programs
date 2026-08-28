/*Q2. Question Statement
Write a Java program to store strings in an ArrayList and count how many strings have length greater than 5.
Description
Store strings in ArrayList
Check string length
Count based on condition
Input
["Apple", "Banana", "Kiwi", "Orange", "Mango"]
Output
Count: 2         */

import java.util.*;

public class Ass2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of string :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre Strings");
		ArrayList<String>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextLine());
		}
		
		int count=0;
		for(String s:ls){
			if(s.length()>5){
				count++;
			}
		}
		System.out.println("Count fo the strings have length greater than 5 ->"+count);
		
	}
}