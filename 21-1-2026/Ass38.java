/*Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not. */

import java.util.*;

public class Ass38{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Attendance : ");
		int a=sc.nextInt();
		System.out.print("Enter Marks : ");
		int m=sc.nextInt();
		
		if(a>=75 && m>=80){
			System.out.print("Eligible ");
		}else{
			System.out.print("Not Eligible ");
				
		}
		
		
	}
}



