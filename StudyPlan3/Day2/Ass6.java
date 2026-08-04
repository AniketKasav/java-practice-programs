/*6. Check Whether a LinkedList is a Palindrome
Difficulty: Medium
Problem Statement 
Given a LinkedList<Character>, determine whether it reads the same from left to right and right to left.
Example
Input: [R, A, D, A, R]
Output: Palindrome               */

import java.util.*;

public class Ass6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number elements");
		int n=sc.nextInt();
		System.out.println("Enter the character:");
		LinkedList<Character>list=new LinkedList<>();
		for(int i=0;i<n;i++){
			list.add(sc.next().charAt(0));
		}
		
		
		System.out.println("==================\nOutput :\n");
		int i=0;
		int j=n-1;
		boolean flag=true;
		while(i<j){
			if(list.get(i)!=list.get(j)){
				flag=false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");			
		}
	}
}