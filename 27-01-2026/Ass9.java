//Q9. WAP to input two values consider the first value as base and second as index and calculate its power.

import java.util.*;
public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base :");
		int base=sc.nextInt();
		System.out.print("Enter the Power :");
		int pow=sc.nextInt();
		int p=1;
		int i=1;
		while(i<=pow){
			p*=base;
			i++;
		}
		System.out.println("Result :"+p);
		
	}
}