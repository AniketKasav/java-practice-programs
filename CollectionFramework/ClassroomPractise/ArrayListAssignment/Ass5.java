/*Q5. Question Statement
Write a Java program to store string array elements into an 
ArrayList and display only names starting with a vowel.
Description
Check first character
Store vowel-based strings
Input
["Anil", "Sunil", "Om", "Ravi", "Umesh"]
Output
[Vowel Names]: [Anil, Om, Umesh]                 */

import java.util.*;

public class Ass5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of names :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre names");
		ArrayList<String>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextLine());
		}
		
		System.out.println("Output:\n[Vowel Names]");
		for(String s:ls){
			char ch=Character.toLowerCase(s.charAt(0));
			if(ch=='a' || ch=='o' || ch=='i' || ch=='u' || ch=='e'){
				System.out.print(s+"  ");
			}
		}
		
		
	}
}