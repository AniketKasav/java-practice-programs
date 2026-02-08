/* Q34. Write a java program to find the frequency of each digit in a given integer.*/

import java.util.*;
public class Ass34{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int temp=num,rem,rem1,freq;
		while(num>0){
			rem=num%10;
			
			int check=temp;
			boolean alreadyPrinted =false;
			while(check>num){
				if(check%10==rem){
					alreadyPrinted=true;
					break;
				}
				check/=10;
			}
			
			
			if(!alreadyPrinted){
			int n=temp;
			freq=0;
			while(n>0){
				rem1=n%10;
				if(rem==rem1){
					freq++;
				}
				n/=10;
			}
			System.out.print(rem+" -> "+freq+" : ");
		}
		num/=10;
		}
		
	}
}