//Q25. Example:  WAP to input number and check number is armstrong or not?
//	For example,153 is a 3-digit Armstrong number because (1^{3}+5^{3}+3^{3}=1+125+27=153.
//Definition: For a number with \(n\) digits, the sum of each digit raised to the power \(n\) must equal the original number.
//3-Digit Examples: (153,370,371,407) (e.g., (371=3^{3}+7^{3}+1^{3})).
//4-Digit Example: (1634=1^{4}+6^{4}+3^{4}+4^{4}).
//Single-Digit Numbers: Numbers (0-9) are considered Armstrong numbers.

import java.util.*;
public class Ass25{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem,count=0;
		
		if(num>0 && num<10){
			System.out.print("Given number is armstrong !!");
			return;
		}
		
		
		while(num>0){
			count++;
			num/=10;
		}
		//System.out.print(count);
		num=temp;
		int sum=0,p;
		while(num>0){
			rem=num%10;
			num/=10;
			p=1;
			for(int i=1;i<=count;i++){
				p=p*rem;
			}
			sum+=p;
		}
		//System.out.print("Sum = "+sum);
		if(temp==sum){
			System.out.print("Given number is armstrong !!");
		}else{
			System.out.print("Given number is not armstrong !!");		
		}
		
		
	}
}