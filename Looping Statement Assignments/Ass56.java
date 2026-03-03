//Q56. Write a Java program to display the following series:
//   7   10   15   22   31   42   55   70
//  (Start at 7, differences increasing by 1 each time: +3, +5, +7...)

import java.util.Scanner;
public class Ass56{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum=7;
		int diff=3;
		for(int i=0;i<num;i++){	
			System.out.print(sum+" ");
			sum+=diff;
			diff+=2;
		}	
	}
}