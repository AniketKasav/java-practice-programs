/*Q9. Question Statement
Write a Java program to store integer array elements into an ArrayList and replace all odd numbers with 0.
Description
Traverse list
Replace odd numbers
Input
Array: 1 2 3 4 5
Output
Updated List: [0, 2, 0, 4, 0]           */

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
			if(ls.get(i)%2==1){
				ls.set(i,0);
			}
		}
		System.out.println("Output\nUpdate List :"+ls);
		
	}
}