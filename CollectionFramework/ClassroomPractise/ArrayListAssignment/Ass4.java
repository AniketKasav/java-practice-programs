/*
Q4. Question Statement
Write a Java program to store integer array elements in an ArrayList and find the maximum element.
Description
Store elements
Compare and find max
Input
Array: 5 8 2 10 3
Output
Maximum: 10
*/

import java.util.*;

public class Ass4{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Entre numbers");
		ArrayList<Integer>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextInt());
		}
		int ans=Integer.MIN_VALUE;
		System.out.println("Output:"+ls);
		for(int a:ls){
			if(a>ans){
				ans=a;
			}
		}
		System.out.println("Maximum :"+ans);
		
	}
}
