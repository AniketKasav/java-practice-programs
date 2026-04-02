/*Q2. Write a function that accepts one integer and prints whether the number is Even or Odd.
Explanation
Use modulo operator %
If number % 2 == 0, print Even
Otherwise, print Odd
No return value used
Example
Input: 7        Output: Number is Odd     */

import java.util.Scanner;
public class Ass2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		evenOrOdd(num);
	}
	
	public static void evenOrOdd(int n){
		if(n%2==0){
			System.out.print("Given number is even");
		}else{
			System.out.print("Given number is odd");
		}
	}
}