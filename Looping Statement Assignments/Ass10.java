//Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class Ass10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int count=0;
		while(num>0){
			num/=10;
			count++;
		}
		System.out.print("the number of digits in a number : "+count);
		
	}
}