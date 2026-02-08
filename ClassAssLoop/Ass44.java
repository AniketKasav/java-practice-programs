/* Q44. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number. */
 
 
/* Q44. Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
Explanation:
 Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number. */

import java.util.Scanner;
public class Ass44{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find all Abundant numbers from 1 to n : ");
		int num=sc.nextInt();
		int temp,sum;
		for(int i=1;i<=num;i++){
			temp=i;	
			sum=0;
			for(int j=1;j<=temp/2;j++){
				if(temp%j==0){
					sum+=j;
				}
			}
			if(sum>i){
				System.out.print(i+" ");
			}
		}
	}
}