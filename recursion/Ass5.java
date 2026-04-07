/*Q5. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321       */

import java.util.Scanner;
public class Ass5{
	static int reverse=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		Reverse(n);
		System.out.printf("The reverse number is : %d",reverse);
	}
	
	public static void Reverse(int n){
		if(n==0){
			return;
		}
		reverse=reverse*10+n%10;
		Reverse(n/10);
	}
	
}