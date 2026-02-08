//Q32. Write a java program to display 1 to nth Strong Number.
/*A strong number (or Krishnamurthy number/Factorion) is a positive integer
 that equals the sum of the factorials of its individual digits, 
 such as 145 (1! + 4! + 5! = 1 + 24 + 120 = 145) or 40585 (4! + 0! + 5! + 8! + 5! = 40585).
 To check if a number is strong, you calculate the factorial of each digit, 
 add them up, and see if the total matches the original number.  */

import java.util.*;
public class Ass32{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n to print 1 to nth Strong Number : ");
		int num=sc.nextInt();
		int temp,rem,p,sum;
		boolean flag=true;
		for(int i=1;i<=num;i++){
			temp=i;
			sum=0;
			while(temp>0){
				rem=temp%10;
				p=1;
				for(int j=1;j<=rem;j++){
					p*=j;
				}
				sum+=p;
				temp/=10;
			}
			if(sum==i){
				System.out.print(i+" ");
				flag=false;
			}
			
		}
		if(flag){
			System.out.printf("There is no strong number between 1 to %d",num);
		}
		
	}
	
	
}
