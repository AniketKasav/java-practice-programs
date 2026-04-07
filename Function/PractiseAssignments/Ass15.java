/*Q15. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4      */

import java.util.Scanner;
public class Ass15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=sc.nextInt();
	
		int result=findMax(a);
		System.out.print("number of digit is : "+result);
		
	}
	
	public static int findMax(int a){
		int count=0;
		while(a!=0){
			count++;
			a/=10;
		}
		return count;
	}
}