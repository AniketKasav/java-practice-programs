//Q54. Write a java program to display following series :
// 1  2  4  7  11  16  22  29  37  46.


import java.util.Scanner;
public class Ass54{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++){
			
			System.out.print(sum+" ");
			sum+=i;
		}
		
	}
}