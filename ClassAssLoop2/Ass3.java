//Q3. Example:  WAP to input number and check number is armstrong or not?
//	For example,153 is a 3-digit Armstrong number because (1^{3}+5^{3}+3^{3}=1+125+27=153.
//Definition: For a number with \(n\) digits, the sum of each digit raised to the power \(n\) must equal the original number.
//3-Digit Examples: (153,370,371,407) (e.g., (371=3^{3}+7^{3}+1^{3})).
//4-Digit Example: (1634=1^{4}+6^{4}+3^{4}+4^{4}).
//Single-Digit Numbers: Numbers (0-9) are considered Armstrong numbers. 

import java.util.*;

public class Ass3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int count = (num == 0) ? 1 : 0;
		while(num>0){
			count++;
			num/=10;
		}
		//System.out.print(count);
		num=temp;
		int rem,sum=0;
		while(num>0){
			rem=num%10;
			num/=10;
			int p=1,i=1;
			while(i<=count){
				p=p*rem;
				i++;
			}
			sum+=p;
		}
		if(sum==temp){
			System.out.print("Number is armstrong number !!");
		}else{
			System.out.print("Number is not armstrong number !!");
		}
		
		
	}
}

