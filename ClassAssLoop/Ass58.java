//Q58. Write a Java program to display the following series:
//2 6 12 20 30 42 56 72 90 110
//(n(n+1) pattern 

import java.util.Scanner;
public class Ass58{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int n;
		for(int i=1;i<=num;i++){
			n=i*(i+1);
			System.out.print(n+" ");
		}
	}
}
