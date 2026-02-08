//Q57. Write a Java program to display the following series:
//     1 1 2 3 5 8 13 21 34
//(Fibonacci series using loop — first 9 terms)

import java.util.Scanner;
public class Ass57{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int i=1;
		int f=1,f1=1,f2;
		System.out.print(f+" "+f1+" ");
		while(i<=num){
		f2=f+f1;
		System.out.print(f2+" ");
		f=f1;
		f1=f2;
		i++;
		}
	}
}
