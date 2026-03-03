/*Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.*/

import java.util.*;

public class Ass54{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day number : ");
		int day=sc.nextInt();
		switch(day){
			case 1:
				System.out.println("Monday-Weekday");
				break;
			case 2:
				System.out.println("Tuesday-Weekday");
				break;
			case 3:
				System.out.println("Wednesday-Weekday");
				break;
			case 4:
				System.out.println("Thursday-Weekday");
				break;
			case 5:
				System.out.println("Friday-Weekday");
				break;
			case 6:
				System.out.println("Saturday-Weekend");
				break;
			case 7:
				System.out.println("Sunday-Weekend");
				break;
			default:
				System.out.println("Invalid number !!");
			
		}
	}
}