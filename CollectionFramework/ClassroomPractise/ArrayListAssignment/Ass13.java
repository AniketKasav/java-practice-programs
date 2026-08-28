/*
Q13.Problem Statement
 Write a Java program to store integer values in an ArrayList. 
 Count how many numbers are even.
Description:
Store integers
Check divisibility by 2
Count even numbers
Input:
 [10, 15, 22, 9, 8]
Output:
 Even Count: 3
 */
 
import java.util.*;

public class Ass13{
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
		
		int count=0;
		for(int num:ls){
			if(num%2==0){
				count++;
			}
		}
		
		System.out.println("Output\n Even Count :"+count);
		
	}
}
