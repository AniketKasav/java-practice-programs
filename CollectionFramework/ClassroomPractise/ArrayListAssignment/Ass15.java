/*Q15.Problem Statement
 Write a Java program to store strings in an ArrayList.
 Reverse every string individually and display the updated list.
Description:
Store strings
Reverse each string separately
Input:
 ["Cat", "Dog", "Java"]
Output:
 ["taC", "goD", "avaJ"]
 */
 
import java.util.*;

public class Ass15{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of string :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Strings");
		ArrayList<String>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextLine());
		}
		
		StringBuilder sb=new StringBuilder();
		ArrayList<String> ans=new ArrayList<>();
		for(String s:ls){
			sb.setLength(0);
			for(char ch:s.toCharArray()){
				sb.insert(0,ch);
			}
			ans.add(sb.toString());
		}
		
		System.out.println("Output :\n"+ans);
	}
}