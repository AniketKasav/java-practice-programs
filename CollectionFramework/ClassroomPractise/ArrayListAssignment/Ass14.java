/*
Q14.Problem Statement
Write a Java program to store integer values in an ArrayList.
Find and display the second highest number.
Description:
Store integers
Find highest and second highest values
Input:
 [10, 25, 40, 18, 35]
Output:
 Second Highest Number: 35
*/

import java.util.*;

public class Ass14{
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
		
		int highest=Integer.MIN_VALUE,sechighest=Integer.MIN_VALUE;
		for(int num:ls){
			//[10, 25, 40, 18, 35]
			if(num>highest){
				sechighest=highest;
				highest=num;
			}else if(num>sechighest){
				sechighest=num;
			}
		}
		
		System.out.println("Highest Number:"+highest);
		System.out.println("Second Highest Number:"+sechighest);
		
	}
}
