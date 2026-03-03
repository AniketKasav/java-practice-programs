/*Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation: Use a char or string in switch to match grades and print remarks.*/

import java.util.*;
public class Ass53{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the grade (A-F):");
		char ch=sc.next().charAt(0);
		ch=Character.toLowerCase(ch);
		
		switch(ch){
			case 'a':
				System.out.print("Excellent");
				break;
			case 'b':
				System.out.print("Good");
				break;
			case 'c':
				System.out.print("Average");
				break;
			case 'd':
				System.out.print("Poor");
				break;
			case 'f':
				System.out.print("Fail");
				break;
			default :
				System.out.print("Invalid input ");
			
			
			
		}
		
		
	}
}
