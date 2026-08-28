/*Q1.Question Statement
Write a Java program to accept an integer array from the user,
store only even numbers into an ArrayList, and display the elements.
Description
Read array elements
Check each number
Store even numbers in ArrayList
Input
Array: 1 2 3 4 5 6
Output
Even Numbers: [2, 4, 6]  */

import java.util.*;

public class Ass1{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integer");
		int n =sc.nextInt();
		ArrayList<Integer>ls=new ArrayList<>();
		System.out.println("Enter the Number:");
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			if(num%2==0){
				ls.add(num);
			}
		}
		System.out.println("Output:\n"+ls);
	}
}