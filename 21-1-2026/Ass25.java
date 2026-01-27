// Q25.Write a java program to find the total number of notes in a given amount. 
//            Enter the amount: 2528
//Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1

import java.util.Scanner;
public class Ass25{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount : ");
		int amount=sc.nextInt();
		int n500=amount/500;
		amount=amount-n500*500;
		int n200=amount/200;
		amount=amount-n200*200;
		int n100=amount/100;
		amount=amount-n100*100;
		int n50=amount/50;		
		amount=amount-n50*50;
		int n20=amount/20;
		amount=amount-n20*20;
		int n10=amount/10;
		amount=amount-n10*10;
		int c5=amount/5;
		amount=amount-c5*5;
		int c2=amount/2;
		amount=amount-c2*2;
		int c1=amount;
		
		System.out.print("500="+n500+", 200="+n200+", 100="+n100+", n50="+n50+", 20="+n20+", 10="+n10+", 5="+c5+", 2="+c2+", 1="+c1);
	}
}