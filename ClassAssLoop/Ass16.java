//Q16. Write a java program to find power of a number.

import java.util.*;
public class Ass16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number and power : ");
		int num=sc.nextInt();
		int pow=sc.nextInt();
		int i=1,p=1;
		while(i<=pow){
			p=p*num;
			i++;
		}
		System.out.print("Result : "+p);
	}
}
