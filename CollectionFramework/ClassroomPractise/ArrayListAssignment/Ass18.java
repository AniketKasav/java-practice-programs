/*
Q18.Problem Statement
 Write a Java program to store integer values in an ArrayList.
 Find and display the smallest number.
Input:
 [15, 8, 20, 4, 11]
Output:
 Smallest Number: 4
 */
 
import java.util.*;

public class Ass18{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter numbers");
		ArrayList<Integer>ls=new ArrayList<>();
		for(int i=0;i<n;i++){
			ls.add(sc.nextInt());
		}
		int smallest=Integer.MAX_VALUE;
		for(int num:ls){
			if(num<smallest) smallest=num;
		}
		
		System.out.println("Smallest Number :"+smallest);
	}
	
	

}