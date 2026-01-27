//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name
//using if else. How to print day of week using if else in java programming.
// here i use the switch case

import java.util.Scanner;

public class Ass31{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the week day(1-7) :");
		int day=sc.nextInt();
		
		switch(day){
			case 1:
			System.out.print("Sunday");
			break;
			case 2:
			System.out.print("Monday");
			break;
			case 3:
			System.out.print("Tuesday");
			break;
			case 4:
			System.out.print("Wednesday");
			break;
			case 5:
			System.out.print("Thursday");
			break;
			case 6:
			System.out.print("Friday");
			break;
			case 7:
			System.out.print("Saturday");
			break;
			default:
			System.out.println("Invalid week number! Please enter a number between 1 and 7.");
			
		}
	}
}