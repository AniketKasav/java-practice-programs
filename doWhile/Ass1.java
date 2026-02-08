//Q1. Check using number is an armstrong number using do while loop.

import java.util.Scanner;
public class Ass1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		
		int temp=num,count=0;
		do{
			count++;
			num/=10;
		}while(num>0);
		int rem,sum=0;	
		num=temp;
		do{
			rem=num%10;
			int p=1;
			for(int i=1;i<=count;i++){
				p=p*rem;
			}
			sum+=p;
			num/=10;
		}while(num>0);
		if(temp==sum){
			System.out.print("Given number is armstrong number ");
		}else{
			System.out.print("Given number is not armstrong number ");
			
		}
	}
	
}

