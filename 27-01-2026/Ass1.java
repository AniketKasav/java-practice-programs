/*Q.1 Write a java Program to display 1 to nth natural numbers.
Q.2 Write a java Program to display 1 to nth Even numbers.
Q.3 Write a java Program to display 1 to nth odd numbers.
Q.4 Write a java Program to take 2 integer from user start and end and find the sum of even number between start and end.
Q.5 Write a java Program to take 2 integer from user start and end and find the sum of odd number between start and end.
Solve above question using while loop*/

import java.util.*;

public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to display 1 to nth numbers : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}	
	}
}