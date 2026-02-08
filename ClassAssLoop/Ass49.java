/*Q49. Task: For a number n, calculate:
Sum of digits at even places (from right)
Sum of digits at odd places (from right)
Finally print the difference of these sums.
Example: n = 572631 → even places sum = 7+6+1 = 14, odd places sum = 5+2+3 = 10 → difference = 4.
Hint: Use a loop with position tracking.    */

import java.util.Scanner;
public class Ass49{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int rem,sum1=0,sum2=0,i=0;
		while(num>0){
			rem=num%10;
			if(i%2==0){
				sum1+=rem;
			}else{
				sum2+=rem;
			}
			i++;
			num/=10;
		}
		System.out.printf("Sum of even places : %d and sum of odd places : %d%n",sum1,sum2);
		System.out.printf("Difference : %d - %d = %d",sum1,sum2,sum1-sum2);
	}
	
}