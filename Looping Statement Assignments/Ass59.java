//Q59. Write a Java program to display the following series: 
//100   81   64   49   36   25   16   9   4   1 
//(Perfect squares in reverse order)

import java.util.Scanner;
public class Ass59{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--){
			System.out.print(i*i+" ");
		}
	}
}