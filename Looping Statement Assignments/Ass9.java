//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to print the table : ");
		int num=sc.nextInt();
		int p;
		for(int i=1;i<=10;i++){
			p=num*i;
			System.out.printf("%d * %d = %d\n",num,i,p);
		}
		
	}
}