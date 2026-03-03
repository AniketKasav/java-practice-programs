//Q50. Task: Identify the first digit in a number that does not repeat anywhere else, using only loops.
//Example: n = 1213451 → first non-repeating digit = 2.

import java.util.Scanner;
public class Ass50{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int temp,rem1,rem2,rnum=0,freq;
		while(num>0){
			rnum=rnum*10+(num%10);
			num/=10;
		}
		num=rnum;
		while(num>0){
			rem1=num%10;
			num/=10;
			temp=rnum;
			freq=0;
			while(temp>0){
				rem2=temp%10;
				temp/=10;
				if(rem2==rem1){
					freq++;
					if(freq==2){
					break;}
				}
			}
			if(freq==1){
				System.out.print("first non-repeating digit ="+rem1);
				break;
			}
		}
	}	
}
