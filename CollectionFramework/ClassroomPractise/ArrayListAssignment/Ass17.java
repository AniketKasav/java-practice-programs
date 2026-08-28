/*
Q17.Problem Statement
 Write a Java program to store strings in an ArrayList.
 Remove all duplicate string values and display unique strings only.
Input:
 ["Java", "Python", "Java", "C++", "Python"]
Output:
 ["Java", "Python", "C++"]
 */
 
import java.util.*;

public class Ass17{
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
		
		ArrayList<String>ans=new ArrayList<>();
		Set<String>s=new HashSet<>();
		for(String str:ls){
			s.add(str);
		}
		System.out.println("Output :\n"+s);
	}
}