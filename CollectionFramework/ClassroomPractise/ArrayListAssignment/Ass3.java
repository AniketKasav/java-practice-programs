/*
Q3. Question Statement
Write a Java program to store array elements into an ArrayList and display them in reverse order.
Description
Store array in ArrayList
Traverse in reverse
Input
Array: 10 20 30 40
Output
Reversed List: [40, 30, 20, 10]
*/

import java.util.*;

public class Ass3{
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
		
		System.out.println("Output:");
		for(int i=ls.size()-1;i>=0;i--){
			System.out.print(ls.get(i)+" ");
		}
		
		
	}
}
