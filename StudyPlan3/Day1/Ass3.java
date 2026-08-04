/* 3. Find the Second Largest Element
Difficulty: Medium
Problem Statement
Given an ArrayList<Integer>, find the second largest unique element. If it does not exist, print an appropriate message.
Example
Input:
[12, 45, 67, 45, 89, 89]
Output:
67

Topic2 : Theory Interview Question  */

import java.util.*;

public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element of the list:");
		int n=sc.nextInt();
		ArrayList<Integer>ls=new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			ls.add(sc.nextInt());
		}
		int seclargest=Integer.MIN_VALUE;
		int largest=Integer.MIN_VALUE;
		for(int a:ls){
			if(a>largest){
				seclargest=largest;
				largest=a;
			}else if (a > seclargest && a != largest) {
                seclargest = a;
            }
		}
		
		if (seclargest==Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second Largest: " + seclargest);
        }
	}
}

