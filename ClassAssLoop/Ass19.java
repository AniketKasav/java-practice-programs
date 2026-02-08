//Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class Ass19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numnber : ");
		int num=sc.nextInt();
		int ld=num%10;
		while(num/10>0){
			num/=10;
		}
		int sum=ld+num;
		System.out.print("sum of the first and last digit of a number : "+sum);
	}
}

