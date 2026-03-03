//Q60. Write a Java program to display the following series: 
// 3   6   12   24   48   96  192 
//(Each term doubles from the previous term starting at 3)

import java.util.Scanner;
public class Ass60{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int ans=3;
		for(int i=1;i<=num;i++){
			System.out.print(ans+" ");
			ans*=2;
		}
	}
}
