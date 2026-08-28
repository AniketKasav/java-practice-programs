/*Q6. Question Statement
Write a Java program to store integer array elements in 
an ArrayList and calculate the sum of all elements.
Description
Store elements
Add all values
Input
Array: 2 4 6 8
Output
Sum: 20               */


import java.util.*;

public class Ass6{
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
		
		int ans=0;
		for(int a:ls){
			ans+=a;
		}
		System.out.println("Output\nSum :"+ans);
		
	}
}