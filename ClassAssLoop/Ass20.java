//Q20. Write a java program to swap first and last digits of a number.

import java.util.*;
public class Ass20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numnber : ");
		int num=sc.nextInt();
		int temp=num;
		int x=1;
		while(temp>9){
			x=x*10;
			temp/=10;
		}
		
		int fd,ld,mid;
		fd=num/x;
		ld=num%10;
		mid=(num%x)/10;
		int res=ld*x+mid*10+fd;
		System.out.print("After swapping : "+res);
		
	}
}
