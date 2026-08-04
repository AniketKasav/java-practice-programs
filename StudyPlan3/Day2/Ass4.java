/*4. Reverse a LinkedList
Difficulty: Easy
Problem Statement
Given a LinkedList<Integer>, reverse the order of all elements without creating another LinkedList.
Example
Input: [10, 20, 30, 40]
Output: [40, 30, 20, 10]       */


import java.util.*;

public class Ass4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number elements");
		int n=sc.nextInt();
		System.out.println("Enter the element:");
		LinkedList<Integer>list=new LinkedList<>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		
		ListIterator<Integer>it=list.listIterator(list.size());
		
		System.out.println("==================\nOutput :\n");
		while(it.hasPrevious()){
			System.out.print(it.previous()+"\t");
		}
			
	}
}

