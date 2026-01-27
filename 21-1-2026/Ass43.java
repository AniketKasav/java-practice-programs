/*Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.*/

import java.util.*;
public class Ass43{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of days late : ");
		int days = sc.nextInt();
		int fine;
		String ms="active";
		if (days < 0) {
			System.out.println("Invalid number of days!");
			return;
		}
		if(days<=5){
			fine=2*days;
		}else if(days<=10){
			fine=10+3*(days-5);
		}else if(days<=30){
			fine=25+(days-10)*5;
		}else{
			fine=500;
			ms="canceled";
		}
		
		System.out.printf("Total fine = %d and membership status = %s",fine,ms);	
	}
}
