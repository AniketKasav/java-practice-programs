/* Q33. Write a java program to display 1 to nth Armstrong Number.
An Armstrong number (or narcissistic number) is a positive integer equal to the sum of
its own digits each raised to the power of the total number of digits. 
For example, 153 is an Armstrong number because (1^{3}+5^{3}+3^{3}=153), 
and 1634 is one because (1^{4}+6^{4}+3^{4}+4^{4}=1634) */

import java.util.*;
public class Ass33{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n to print 1 to nth Armstrong Number : ");
		int n=sc.nextInt();
		int count=0;
		int temp,flag=0,rem,sum;
		for(int i=1;i<=n;i++){
			temp=i;
			count=0;
			while(temp>0){
				temp/=10;
				count++;
			}
			temp=i;
			sum=0;
			
			while(temp>0){
				rem=temp%10;
				int p=1;
				for(int j=0;j<count;j++){
					p*=rem;
				}
				sum+=p;
				temp/=10;
			}
			if(sum==i){
				System.out.print(i+" ");
				flag=1;
			}
		}
		if(flag==0){
			System.out.print("There is no armstrong number between 1 to "+n);
		}
	}
	
	
}