/*Q1. Write a recursive function that prints numbers from 1 to N.
Explanation:
The function should print the current number.
It should call itself with the next number.
Stop when the number becomes greater than N.
Example:
 Input: N = 5
 Output: 1 2 3 4 5     */
 
import java.util.Scanner;
public class Ass1{
	static int num=1;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		printNumber(num,n);
	}
	
	public static void printNumber(int num,int n){
		if(num>n){
			return;
		}
		System.out.print(num+" ");
		printNumber(num+1,n);
	}
	
}