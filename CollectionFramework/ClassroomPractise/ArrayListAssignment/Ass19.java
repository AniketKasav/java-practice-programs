/*
Q19.Problem Statement
 Write a Java program to store strings in an ArrayList.
 Count total vowels present in all strings.
Input:
 ["Apple", "Java", "Orange"]
Output:
 Total Vowels: 7
 */
 
import java.util.*;

public class Ass19{
	static int count=0;
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
		
		for(String str:ls){
			count+=countVowel(str);
		}
		System.out.println("Total Vowel :"+count);
	}
	
	public static int countVowel(String str){
		int count=0;
		for(char ch:str.toLowerCase().toCharArray()){
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='e'){
				count++;
			}
		}
		return count;
	} 
}