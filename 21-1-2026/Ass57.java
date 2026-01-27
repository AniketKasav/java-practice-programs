/*Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation: Use switch on the level number and print the salary range.*/

import java.util.*;
public class Ass57{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee level(1-3) :");
		int l=sc.nextInt();
		
		switch(l){
			case 1:
				System.out.print("Junior (20,000 - 30,000)");
				break;
			case 2:
				System.out.print("Mid (31,000 - 50,000)");
				break;
			case 3:
				System.out.print("Senior (51,000 - 80,000)");
				break;
			default :
				System.out.print("Invalid input !!");
		}
		
		
	}
}
