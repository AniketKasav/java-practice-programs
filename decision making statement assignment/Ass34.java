/*Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.*/

import java.util.Scanner;

public class Ass34{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the years of service :");
		int years=sc.nextInt();
		System.out.print("Enter the salary :");
		int salary=sc.nextInt();
		
		
		if(years>5){
			float bonus=salary*0.05f;
			System.out.print("Bonus amount : "+bonus);
		}else{
		System.out.print("No bonus");
		}
		
		
	}
}
