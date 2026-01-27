/*Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.*/

import java.util.*;

public class Ass41{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary : ");
		int bs=sc.nextInt();
		System.out.print("Enter years of service : ");
		int yos=sc.nextInt();
		System.out.print("Enter performance rating(1-5)");
		int pr=sc.nextInt();
		float nsalary;
		if(pr>=4 && yos>5){
			nsalary=bs+bs*0.2f;
		}else if(pr>=3){
			nsalary=bs+bs*0.1f;
		}else{
			nsalary=bs+bs*0.05f;
		}
		System.out.print("New Salary : "+nsalary);
		
	}
}
