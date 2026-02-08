//Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
public class Ass18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numnber : ");
		int num=sc.nextInt();
		int ld=num%10;
		while(num/10>0){
			num/=10;
		}
		System.out.printf("first : %d and last digit : %d of a number",num,ld);
	}
}
