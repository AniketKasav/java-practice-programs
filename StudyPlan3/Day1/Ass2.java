/* 2. Merge Two Sorted ArrayLists
Difficulty: Easy–Medium
Problem Statement
Given two sorted ArrayList<Integer> objects, merge them into a single sorted ArrayList without using any built-in sorting method.
Example
Input:
List1 = [1, 3, 5]
List2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6]   */

import java.util.*;

public class Ass2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element of the list1:");
		int n1=sc.nextInt();
		ArrayList<Integer>ls1=new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<n1;i++){
			ls1.add(sc.nextInt());
		}
		System.out.println("Enter the number of element of the list2:");
		int n2=sc.nextInt();
		ArrayList<Integer>ls2=new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<n2;i++){
			ls2.add(sc.nextInt());
		}
		ArrayList<Integer>result=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<ls1.size() && j<ls2.size()){
			if(ls1.get(i)<ls2.get(j)){
				result.add(ls1.get(i));
				i++;
			}else{
				result.add(ls2.get(j));
				j++;
			}
		}
	while(i<ls1.size()){
		result.add(ls1.get(i));
		i++;
	}
	while(j<ls2.size()){
		result.add(ls2.get(j));
		j++;
	}
	
	System.out.println("Output"+result);
	}
}
 