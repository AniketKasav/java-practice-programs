/*
Q12.Problem Statement
 Write a Java program to store string values in an ArrayList.
 Compare the length of all strings and display the longest string.
Description:
Store strings
Compare lengths
Find maximum length string
Input:
 ["Java", "Programming", "Code", "ArrayList"]
Output:
 Longest String: Programming
 */
 
import java.util.*;

public class Ass12{
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
		
		String Longest=ls.get(0);
		for(int i=1;i<ls.size();i++){
			if(ls.get(i).length()>Longest.length()){
				Longest=ls.get(i);
			}
		}
		
		System.out.println(" Longest String: "+Longest);
		
	}
}