/*1. Remove Duplicates from an ArrayList
Difficulty: Easy
Problem Statement
Given an ArrayList<Integer> containing duplicate elements, remove all duplicate values while preserving the order of their first occurrence.
Example
Input:
[10, 20, 10, 30, 20, 40]

Output:
[10, 20, 30, 40]     */

import java.util.*;

public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element of the list:");
		int n=sc.nextInt();
		ArrayList<Integer>ls=new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			ls.add(sc.nextInt());
		}
		System.out.println("Output :");
		HashSet<Integer>set=new HashSet<>();
		ArrayList<Integer>result=new ArrayList<>();
		for(int a:ls){
			if(!set.contains(a)){
				result.add(a);
				set.add(a);
			}
		}
		System.out.println(result);
	}
}
