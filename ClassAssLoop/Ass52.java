//Q52. Write a java program to display following series :
// 2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 

import java.util.Scanner;
public class Ass52{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum=2;
		for(int i=num;i>=1;i--){
			System.out.print(sum+" ");
			System.out.print((int)Math.pow(i,3)+" ");
			sum+=2;	
		}
		
	}
}