/*Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month.
Consider leap year for February.
Explanation: Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.*/

import java.util.*;
public class Ass51{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month number : ");
		int m=sc.nextInt();
		
		switch(m){
			case 1:
				System.out.print("Number of days:31");
				break;
			case 2:
				System.out.print("Enter the year :");
				int y=sc.nextInt();
				if(y%400==0){
					System.out.print("Number of days:29");
				}else if(y%4==0 && y%100!=0){
					System.out.print("Number of days:29");
				}else{
					System.out.print("Number of days:28");
				}
				break;
			case 3:
				System.out.print("Number of days:31");
				break;
			case 4:
				System.out.print("Number of days:30");
				break;
			case 5:
				System.out.print("Number of days:31");
				break;
			case 6:
				System.out.print("Number of days:30");
				break;
			case 7:
				System.out.print("Number of days:31");
				break;
			case 8:
				System.out.print("Number of days:31");
				break;
			case 9:
				System.out.print("Number of days:30");
				break;
			case 10:
				System.out.print("Number of days:31");
				break;
			case 11:
				System.out.print("Number of days:30");
				break;
			case 12:
				System.out.print("Number of days:31");
				break;
			default:
				System.out.print("Enter valid number");
			
			
		}
		
		
		
	}
}
