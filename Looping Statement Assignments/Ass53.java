//Q53. Write a java program to display following series :
//   1  4  9  16  25  36  49  64  81  100

import java.util.Scanner;
public class Ass53{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(i*i+" ");
		}
		
	}
}