/*Q9. Write a Java program using a void function to check whether a number is a Strong Number.
A Strong Number is a number whose sum of factorials of digits equals the number.
Explanation
Extract each digit
Calculate factorial using a loop (no recursion)
Add factorials
Compare with original number
Print result inside function                             */

import java.util.Scanner;
public class Ass9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		strongNumber(num);
	}
	
	public static void strongNumber(int  n){
		int temp=n;
		int sum=0;
		while(temp!=0){
			int rem=temp%10;
			int fact=1;
			for(int i=2;i<=n;i++){
				fact*=i;
			}
			sum+=fact;
		}
		if(sum==n){
			System.out.print("Given number is strong number ");
		}else{
			System.out.print("Given number is not strong number ");
		}
		
	}
}