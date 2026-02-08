/*Q47. Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
Example: 145 → 1! + 4! + 5! = 145.   5!=5*4*3*2*1
Explanation:
 Use loops :
Outer loop for numbers from 1 to n.
Inner loop to extract digits and compute each digit’s factorial with another nested loop.
Sum and compare with the original number. */

import java.util.Scanner;
public class Ass47{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to display all Krishnamurthy numbers from 1 to n : ");
		int num=sc.nextInt();
		int temp,rem,fact,sum;
		for(int i=1;i<=num;i++){
			temp=i;
			sum=0;
			while(temp>0){
			rem=temp%10;
			fact=1;
			for(int j=2;j<=rem;j++){
				fact*=j;
			}
			sum+=fact;
			temp/=10;
			}
			if(i==sum){
				System.out.print(i+" ");
			}
			
		}
		
	}
}

