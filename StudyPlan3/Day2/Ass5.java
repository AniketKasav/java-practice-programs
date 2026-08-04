/*5. Find the Middle Element
Difficulty: Medium
Problem Statement
Given a LinkedList<Integer>, find and print its middle element. 
If the list has an even number of elements, print the second middle element.
Example
Input: [1, 2, 3, 4, 5, 6]
Output: 4                         */


import java.util.*;
public class Ass5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<>();
		System.out.println("Enter the number of elements ");
		int n=sc.nextInt();
		System.out.println("Enter the element");
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		
		System.out.println("====================\nOutput:");
		System.out.println(list.get(n/2));
		
	}
}