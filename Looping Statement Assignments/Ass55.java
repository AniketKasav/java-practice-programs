//Q55. Write a java program to display following series :
//  	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40


import java.util.Scanner;
public class Ass55{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++){
			System.out.print(i*5+" "+i*3+" ");
		}
		
	}

}