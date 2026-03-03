//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else.
// How to print the number of days in a given month using if else in java programming.

import java.util.Scanner;

public class Ass30{
	public static void main(String[] args){
		System.out.print("Enter the month number(1-12) : ");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m==2){
			System.out.print("days=28/29");
		}else if (m == 1 || m == 3 || m == 5 || m == 7 ||m == 8 || m == 10 || m == 12){
			System.out.print("days=31");
			
		}else if(m == 4 || m == 6 || m == 9 || m == 11){
			System.out.print("days=30");
		}else{
			System.out.print("Enter valid month");
			
		}
	}
}