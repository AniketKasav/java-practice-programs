//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.Scanner;

public class Ass18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student score : ");
		int score=sc.nextInt();
		if(score>=40){
			System.out.print("Pass !!");
		}else{
			System.out.print("Fail ..");
		}
		
		
		
		
	}
}