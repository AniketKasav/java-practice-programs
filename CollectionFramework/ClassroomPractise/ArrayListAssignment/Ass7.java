/*Q7. Question Statement
Write a Java program to store integer array elements 
into an ArrayList and remove all negative numbers.
Description
Store values
Remove negatives using condition
Input
Array: -1 2 -3 4 5
Output
Updated List: [2, 4, 5]            */


import java.util.*;

public class Ass7{
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
		
		for(int i=0;i<ls.size();i++){
			if(ls.get(i)<0){
				ls.remove(i);
				i--;
			}
		}
		System.out.println("Output\nUpdate List :"+ls);
		
	}
}

