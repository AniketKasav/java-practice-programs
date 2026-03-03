/*Q59. Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
Explanation: Simple switch with four cases and default for invalid input.*/

import java.util.*;
public class Ass59{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number (1-4) :");
		int n=sc.nextInt();
		
		switch(n){
			case 1:
				System.out.print("Spring");
				break;
			case 2:
				System.out.print("Summer");
				break;
			case 3:
				System.out.print("Autum");
				break;
			case 4:
				System.out.print("Winter");
				break;
			default :
				System.out.print("Invalid input");
		}
		
		
	}
	
}
