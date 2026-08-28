/*
Q11.Problem Statement
Write a Java program to store multiple string values in an ArrayList.
Traverse all elements and count how many strings have length greater than 5.
Description:
Store strings in ArrayList
Check length of each string
Count strings with length > 5
Input:
 ["Apple", "Banana", "Kiwi", "Orange", "Mango"]
Output:
 Count: 2
*/

import java.util.*;

public class Ass11{
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