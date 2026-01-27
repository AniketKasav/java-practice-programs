//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators

import java.util.Scanner;
public class Ass19{
	public static void main(String[] args){
		System.out.print("Enter the score : ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(s>=90?"Excellent":s>=75?"Good":s>=50?"Average":"Poor");
		
		
		
		
	}
}