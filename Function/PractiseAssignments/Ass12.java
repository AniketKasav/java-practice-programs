/*Q12. Write a method that takes an integer and returns 1 if the number is even, otherwise returns 0.
Explanation
If number is divisible by 2 → Even
Else → Odd
Method returns an integer value
Method Signature - static int isEven(int num)
Input - num = 7 
Output - Odd             */

import java.util.Scanner;
public class Ass12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		
		int result=isEven(num);
		if(result==1){
			System.out.print("Even");
		}else{
			System.out.print("Odd");	
		}
	}
	
	public static int isEven(int n){
		return n%2==0?1:0;
	}
}