/*Q8. Question Statement
Write a Java program to store strings in an ArrayList and count how many strings are palindrome.
Description
Check string reverse
Compare original and reverse
Input
["madam", "hello", "level", "java"]
Output
Palindrome Count: 2 */

import java.util.*;

public class Ass8{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of strings :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre strings");
		ArrayList<String>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextLine());
		}
		
		int count=0;
		for(String s:ls){
			if(palindrome(0,s.length()-1,s)){
				count++;
			}
		}
		System.out.println("Output\nPalidrome Count: "+count);
	}
	
	public static boolean palindrome(int left,int right,String s){
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}